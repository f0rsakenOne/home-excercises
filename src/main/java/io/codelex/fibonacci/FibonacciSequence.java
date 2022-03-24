package io.codelex.fibonacci;

public class FibonacciSequence {
    public int getNumber(int index) {
        if (index < 1) {
            throw new IllegalArgumentException("Index is wrong :/");
        } else if (index <= 2) {
            return index - 1;
        } else {
            return getNumber(index - 1) + getNumber(index - 2);
        }
    }
}
