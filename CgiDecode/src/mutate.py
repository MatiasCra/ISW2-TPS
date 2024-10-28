from random import choice
from typing import List

from src.create_population import create_test_case, get_random_character


def add_character(test_case: str) -> str:
    chosen_char = get_random_character()
    if len(test_case) == 0:
        return chosen_char

    position = choice(range(len(test_case)))
    return test_case[:position] + chosen_char + test_case[position:]


def remove_character(test_case: str) -> str:
    position = choice(range(len(test_case)))
    return test_case[:position] + test_case[position + 1 :]


def modify_character(test_case: str) -> str:
    chosen_char = get_random_character()
    position = choice(range(len(test_case)))
    return test_case[:position] + chosen_char + test_case[position + 1 :]


def add_test_case(individual: List[str]) -> List[str]:
    return individual + [create_test_case()]


def remove_test_case(individual: List[str]) -> List[str]:
    chosen_case = choice(range(len(individual)))
    return individual[:chosen_case] + individual[chosen_case + 1 :]


def modify_test_case(individual: List[str]) -> List[str]:
    options = []
    chosen_case = choice(range(len(individual)))

    if len(individual[chosen_case]) > 0:
        options.append(remove_character)
        options.append(modify_character)

    if len(individual[chosen_case]) < 10:
        options.append(add_character)

    modification = choice(options)
    modified_case = modification(individual[chosen_case])
    return individual[:chosen_case] + [modified_case] + individual[chosen_case + 1 :]


def mutate(individual: List[str]) -> List[str]:
    options = []
    if len(individual) > 0:
        options.append(remove_test_case)
        options.append(modify_test_case)

    if len(individual) < 15:
        options.append(add_test_case)

    modification = choice(options)
    return modification(individual)
