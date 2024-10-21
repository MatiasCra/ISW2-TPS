import sys
from typing import Dict, Union

# Inicializar mappings globales
distances_true: Dict[int, int] = {}
distances_false: Dict[int, int] = {}


def update_maps(condition_num: int, d_true: int, d_false: int):
    global distances_true, distances_false

    if condition_num in distances_true.keys():
        distances_true[condition_num] = min(distances_true[condition_num], d_true)
    else:
        distances_true[condition_num] = d_true

    if condition_num in distances_false.keys():
        distances_false[condition_num] = min(distances_false[condition_num], d_false)
    else:
        distances_false[condition_num] = d_false


def clear_maps():
    global distances_true, distances_false
    distances_true.clear()
    distances_false.clear()


def get_true_distance(condition_num: int) -> Union[int, None]:
    global distances_true
    if condition_num in distances_true.keys():
        return distances_true[condition_num]
    else:
        return None


def get_false_distance(condition_num: int) -> Union[int, None]:
    global distances_false
    if condition_num in distances_false.keys():
        return distances_false[condition_num]
    else:
        return None


def has_reached_condition(condition_num: int) -> bool:
    global distances_true, distances_false
    return (
        condition_num in distances_true.keys()
        or condition_num in distances_false.keys()
    )


def evaluate_condition(
    condition_num: int, op: str, lhs: Union[int, str], rhs: Union[int, str, Dict]
) -> bool:
    if isinstance(lhs, str) and isinstance(rhs, str):
        rhs = ord(rhs[0])
        lhs = ord(lhs[0])

    dist_true = 1
    dist_false = 1
    if op == "Eq":
        dist = abs(lhs - rhs)
        res = dist == 0
        dist_true = 0 if res else dist
        dist_false = 1 if res else 0
    elif op == "Ne":
        dist = abs(lhs - rhs)
        res = dist != 0
        dist_true = 0 if res else 1
        dist_false = dist if res else 0
    elif op == "Lt":
        dist = abs(lhs - rhs)
        res = lhs < rhs
        dist_true = 0 if res else dist + 1
        dist_false = dist if res else 0
    elif op == "Le":
        dist = abs(lhs - rhs)
        res = lhs <= rhs
        dist_true = 0 if res else dist
        dist_false = dist + 1 if res else 0
    elif op == "Gt":
        dist = abs(lhs - rhs)
        res = lhs > rhs
        dist_true = 0 if res else dist + 1
        dist_false = dist if res else 0
    elif op == "Ge":
        dist = abs(lhs - rhs)
        res = lhs >= rhs
        dist_true = 0 if res else dist
        dist_false = dist + 1 if res else 0
    else:  # op == "In":
        res = lhs in rhs
        dist = min(
            (
                abs(ord(e) - ord(lhs))
                if isinstance(e, str)
                else abs(e - lhs)
                for e in rhs
            ),
            default=sys.maxsize,
        )
        dist_true = 0 if res else dist
        dist_false = 0 if res else 1

    update_maps(condition_num, dist_true, dist_false)
    return res
