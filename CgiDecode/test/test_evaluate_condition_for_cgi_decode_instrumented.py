#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance


class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    def testHelloWorld(self):
        clear_maps()
        self.assertEqual(cgi_decode_instrumented(r"Hello+World"), "Hello World")
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_true_distance(2), 0)
        self.assertEqual(get_true_distance(3), 35)
        self.assertEqual(get_false_distance(1), 0)
        self.assertEqual(get_false_distance(2), 0)
        self.assertEqual(get_false_distance(3), 0)

    def testOk(self):
        clear_maps()
        self.assertEqual(cgi_decode_instrumented(r"%5a"), "Z")
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_true_distance(2), 6)

    def testFailHigh(self):
        clear_maps()
        self.assertRaises(ValueError, cgi_decode_instrumented, r"%pa")

