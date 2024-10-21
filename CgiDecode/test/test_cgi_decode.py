#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    def testOk(self):
        self.assertEqual(cgi_decode(r"Hola + %5a"), "Hola   Z")

    def testFailHigh(self):
        self.assertRaises(ValueError, cgi_decode, r"%pa")

    def testFailLow(self):
        self.assertRaises(ValueError, cgi_decode, r"%ap")
