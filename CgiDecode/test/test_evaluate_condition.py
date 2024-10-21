#!./venv/bin/python
import unittest
from src.evaluate_condition import evaluate_condition


class TestEvaluateCondition(unittest.TestCase):
    def testAll(self):
        self.assertFalse(evaluate_condition(1, "Eq", 10, 20))
        self.assertTrue(evaluate_condition(1, "Eq", 20, 20))
        self.assertTrue(evaluate_condition(1, "Ne", 20, 10))
        self.assertFalse(evaluate_condition(1, "Ne", 20, 20))
        self.assertTrue(evaluate_condition(1, "Le", 10, 20))
        self.assertFalse(evaluate_condition(1, "Le", 20, 10))
        self.assertTrue(evaluate_condition(1, "Lt", 10, 20))
        self.assertFalse(evaluate_condition(1, "Lt", 20, 10))
        self.assertFalse(evaluate_condition(1, "Ge", 10, 20))
        self.assertTrue(evaluate_condition(1, "Ge", 20, 10))
        self.assertFalse(evaluate_condition(1, "Gt", 10, 20))
        self.assertTrue(evaluate_condition(1, "Gt", 20, 10))

        self.assertFalse(evaluate_condition(2, "In", 10, {}))
        self.assertFalse(evaluate_condition(2, "In", 10, {0: "a"}))
        self.assertTrue(evaluate_condition(2, "In", 10, {10: "a"}))

        self.assertTrue(evaluate_condition(3, "Eq", "a", "a"))
