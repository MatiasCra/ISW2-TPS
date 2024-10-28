from typing import List

from src.get_fitness_cgi_decode import get_fitness_cgi_decode


def evaluate_population(population: List[List[str]]) -> dict:
    return {
        ind: get_fitness_cgi_decode(population[ind]) for ind in range(len(population))
    }
