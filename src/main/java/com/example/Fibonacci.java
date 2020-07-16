package com.example;

public class Fibonacci {

    public static int get(int n) {

        return n == 0 || n == 1 ? 1 : Fibonacci.get(n - 2) + Fibonacci.get(n - 1);

    }

}
