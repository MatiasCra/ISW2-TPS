from random import random
from typing import List

from src.create_population import create_population
from src.crossover import crossover
from src.evaluate_population import evaluate_population
from src.mutate import mutate
from src.selection import selection


class GeneticAlgorithm:
    def __init__(self):
        self.population_size = 100
        self.tournament_size = 5
        self.p_crossover = 0.70
        self.p_mutation = 0.20

        self.generation = 0
        self.best_individual = None
        self.fitness_best_individual = None

    def get_best_individual(self):
        return self.best_individual

    def get_fitness_best_individual(self):
        return self.fitness_best_individual

    def get_generation(self):
        return self.generation

    def generate_crossovers(
        self, population: List[List[str]], fitness_by_individual: dict
    ) -> List[List[str]]:
        p1_idx, _ = selection(fitness_by_individual, self.tournament_size)
        p2_idx, _ = selection(fitness_by_individual, self.tournament_size)
        p1 = population[p1_idx]
        p2 = population[p2_idx]

        if random() < self.p_crossover:
            o1, o2 = crossover(p1, p2)
            return self.generate_mutations([o1, o2])

        return []

    def generate_mutations(self, population: List[List[str]]) -> List[List[str]]:
        o1, o2 = population
        m1 = mutate(o1) if random() < self.p_mutation else o1
        m2 = mutate(o2) if random() < self.p_mutation else o2
        return [m1, m2]

    def covered_all_branches(self, fitness_individual: float) -> bool:
        return fitness_individual == 0

    def run(self):
        # Generar y evaluar la poblacion inicial
        population = create_population(self.population_size)
        fitness_by_individual = evaluate_population(population)

        # Imprimir el mejor valor de fitness encontrado
        self.best_individual, self.fitness_best_individual = min(
            (
                (population[idx], fitness)
                for idx, fitness in fitness_by_individual.items()
            ),
            key=lambda v: (v[1], v[0]),
        )

        # Continuar mientras la cantidad de generaciones es menor que 1000
        # y no haya ningun individuo que cubra todos los objetivos

        while self.generation < 1000 and not self.covered_all_branches(
            self.fitness_best_individual
        ):

            # Producir una nueva poblacion en base a la anterior.
            # Usar selection, crossover y mutation.
            new_population = []
            while len(new_population) < self.population_size:
                new_population += self.generate_crossovers(
                    population, fitness_by_individual
                )

            # Una vez creada, reemplazar la poblacion anterior con la nueva
            self.generation += 1
            population = new_population

            # Evaluar la nueva poblacion e imprimir el mejor valor de fitness
            fitness_by_individual = evaluate_population(population)
            self.best_individual, self.fitness_best_individual = min(
                (
                    (population[idx], fitness)
                    for idx, fitness in fitness_by_individual.items()
                ),
                key=lambda v: (v[1], v[0]),
            )

        # retornar el mejor individuo de la ultima generacion
        return self.best_individual
