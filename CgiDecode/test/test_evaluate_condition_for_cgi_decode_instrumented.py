#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance


class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    def testHelloWorld(self):
        clear_maps()
        self.assertEqual(cgi_decode_instrumented(r"Hello+World"), "Hello World")
        self.assertEqual(cgi_decode_instrumented(r"Hello+World"), cgi_decode(r"Hello+World"))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_true_distance(2), 0)
        self.assertEqual(get_true_distance(3), 35)
        self.assertEqual(get_false_distance(1), 0)
        self.assertEqual(get_false_distance(2), 0)
        self.assertEqual(get_false_distance(3), 0)

    def testOk(self):
        clear_maps()
        self.assertEqual(cgi_decode_instrumented(r"%5a"), "Z")
        self.assertEqual(cgi_decode_instrumented(r"%5a"), cgi_decode(r"%5a"))
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_true_distance(2), 6)
        self.assertEqual(get_true_distance(3), 0)
        self.assertEqual(get_true_distance(4), 0)
        self.assertEqual(get_true_distance(5), 0)

        self.assertEqual(get_false_distance(1), 0)
        self.assertEqual(get_false_distance(2), 0)
        self.assertEqual(get_false_distance(3), 1)
        self.assertEqual(get_false_distance(4), 1)
        self.assertEqual(get_false_distance(5), 1)

    def testFailHigh(self):
        clear_maps()
        self.assertRaises(ValueError, cgi_decode_instrumented, r"%ga")
        self.assertRaises(ValueError, cgi_decode, r"%ga")
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_true_distance(2), 6)
        self.assertEqual(get_true_distance(3), 0)
        self.assertEqual(get_true_distance(4), 1)

        self.assertEqual(get_false_distance(1), 3)
        self.assertEqual(get_false_distance(2), 0)
        self.assertEqual(get_false_distance(3), 1)
        self.assertEqual(get_false_distance(4), 0)

    def testFailLow(self):
        clear_maps()
        self.assertRaises(ValueError, cgi_decode_instrumented, r"%ag")
        self.assertRaises(ValueError, cgi_decode, r"%ag")
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_true_distance(2), 6)
        self.assertEqual(get_true_distance(3), 0)
        self.assertEqual(get_true_distance(4), 0)
        self.assertEqual(get_true_distance(5), 1)

        self.assertEqual(get_false_distance(1), 3)
        self.assertEqual(get_false_distance(2), 0)
        self.assertEqual(get_false_distance(3), 1)
        self.assertEqual(get_false_distance(4), 1)
        self.assertEqual(get_false_distance(5), 0)