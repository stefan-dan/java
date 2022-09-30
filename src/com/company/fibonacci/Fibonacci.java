package com.company.fibonacci;

public class Fibonacci {

    public int getSeries(int n) {
        if (n < 2) {
            return n;
        }
        int[] fibonacci = new int[n + 2];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n + 2; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci[n];
    }

    public int getSeriesRecursion(int n) {
        if (n < 2) {
            return n;
        }
        return getSeriesRecursion(n - 1) + getSeriesRecursion(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getSeries(1));
        System.out.println(fibonacci.getSeries(2));
        System.out.println(fibonacci.getSeries(9));
        System.out.println("---------------------");
        System.out.println(fibonacci.getSeriesRecursion(1));
        System.out.println(fibonacci.getSeriesRecursion(2));
        System.out.println(fibonacci.getSeriesRecursion(9));
    }
}
