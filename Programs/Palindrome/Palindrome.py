from __future__ import annotations
""" palindrome.py
    
Defines a function to check if a string is a palindrome

Unless otherwise stated and not an abstract method, best case and worst case complexity is O(1)
If only one complexity is stated, than worst and best case time complexity are the same.
"""
from data_structures.stack_adt import ArrayStack


def check_palindrome(input_str: str) -> bool:
    """ Checks if input string is a palindrome
    
    :Input:
        input_str (str): The string to check
    
    :Returns:
        bool: True if the input string is a palindrome, False otherwise
    
    :Complexity: O(n) where n is the length of the input string
    """
