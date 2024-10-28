from random import randint
from typing import List, Tuple


def crossover(parent1: List[str], parent2: List[str]) -> Tuple[List[str], List[str]]:
    cut = randint(0, min(len(parent1), len(parent2)) - 1)
    offspring1 = parent1[:cut] + parent2[cut:]
    offspring2 = parent2[:cut] + parent1[cut:]
    return offspring1, offspring2
