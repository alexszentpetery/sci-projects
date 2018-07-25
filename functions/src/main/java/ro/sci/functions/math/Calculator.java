package ro.sci.functions.math;

public class Calculator {
    public int aduna(int x, int y) {
        return x + y;
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
