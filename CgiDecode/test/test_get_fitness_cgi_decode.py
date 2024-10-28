#!./venv/bin/python
import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode


class TestGetFitnessCgiDecode(unittest.TestCase):
    def testExample(self):
        self.assertEqual(get_fitness_cgi_decode([r"%AA"]), 2.357142857142857)
        self.assertEqual(get_fitness_cgi_decode([r"\%AA"]), 1.8571428571428572)
        self.assertEqual(get_fitness_cgi_decode([r"\%AU"]), 3.03021978021978)
        self.assertEqual(get_fitness_cgi_decode([r"\%UU"]), 4.53021978021978)
        self.assertEqual(get_fitness_cgi_decode([r"Hello+Reader"]), 4.972222222222222)
        self.assertEqual(get_fitness_cgi_decode([r""]), 8.5)
        self.assertEqual(get_fitness_cgi_decode([r"\%"]), 5.357142857142858)
        self.assertEqual(get_fitness_cgi_decode([r"\%1"]), 5.523809523809524)
        self.assertEqual(get_fitness_cgi_decode([r"+"]), 6.5)
        self.assertEqual(get_fitness_cgi_decode([r"+\%1"]), 4.666666666666666)
        self.assertEqual(get_fitness_cgi_decode([r"\%1+"]), 2.9404761904761907)
        self.assertEqual(get_fitness_cgi_decode([r"\%1+", r"%+1", r"a+%AA"]), 0)
