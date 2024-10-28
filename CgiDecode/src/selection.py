from random import sample
from typing import Tuple


def selection(fitness_by_individual: dict, tournament_size: int) -> Tuple[int, float]:
    """
    fitness_by_individual: Diccionario que contiene a los individuos de la población como keys y su fitness como valores.
    tournament_size: Tamaño del torneo (entero positivo).
    """
    individuals = sample(list(fitness_by_individual.keys()), tournament_size)
    winner = min(individuals, key=lambda individual: fitness_by_individual[individual])
    return winner, fitness_by_individual[winner]
