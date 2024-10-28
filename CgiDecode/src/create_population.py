from random import choice
from string import printable
from typing import List


def get_random_character():
    return choice(printable)


def create_test_case() -> str:
    string_len = choice(range(11))
    return "".join(get_random_character() for _ in range(string_len))


def create_individual() -> List[str]:
    individual_strings = choice(range(1, 16))
    return [create_test_case() for _ in range(individual_strings)]


def create_population(population_size) -> List[List[str]]:
    return [create_individual() for _ in range(population_size)]
