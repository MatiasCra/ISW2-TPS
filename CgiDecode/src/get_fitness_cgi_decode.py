from typing import List
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance
from src.cgi_decode_instrumented import cgi_decode_instrumented


def get_fitness_cgi_decode(test_suite: List[str]) -> float:
    # Borro la información de branch coverage de ejecuciones anteriores
    # Recuerden que los diccionarios true_distances y false_distances son globales
    clear_maps()

    for test_case in test_suite:
        try:
            cgi_decode_instrumented(test_case)
        except Exception:
            pass

    fitness = 0
    for branch in range(1, 6):
        dist = get_true_distance(branch)
        if dist is None:
            dist = 1
        else:
            dist /= dist + 1

        fitness += dist
        dist = get_false_distance(branch)
        if dist is None:
            dist = 1
        else:
            dist /= dist + 1

        fitness += dist

    return fitness
