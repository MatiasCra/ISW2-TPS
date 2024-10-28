#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):
    def test1(self):
        seed(1)
        ga = GeneticAlgorithm()
        ga.run()
        self.assertEqual(ga.generation, 3)
        self.assertEqual(ga.fitness_best_individual, 0)

    def test2(self):
        seed(2)
        ga = GeneticAlgorithm()
        ga.run()
        self.assertEqual(ga.generation, 2)
        self.assertEqual(ga.fitness_best_individual, 0)

    def test3(self):
        seed(3)
        ga = GeneticAlgorithm()
        ga.run()
        self.assertEqual(ga.generation, 3)
        self.assertEqual(ga.fitness_best_individual, 0)
