import pytest

from calculator import add

def test_add():
    assert add(25,25) == 50