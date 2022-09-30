package com.company.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println("-----------Loop----------");
        fizzBuzz.printFizzBuzz();
        System.out.println("---------Recursion-------");
        fizzBuzz.printFizzBuzzRecursion(1);
        System.out.println("---------FizzBuzz and numbers that contains 3 or 5-------");
        fizzBuzz.printFizzBuzzThatContainsThreeOrFive();
    }

    private void printFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private void printFizzBuzzRecursion(int i) {
        if (i > 100) {
            return;
        }
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " is FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println(i + " is Fizz");
        } else if (i % 5 == 0) {
            System.out.println(i + " is Buzz");
        } else {
            System.out.println(i);
        }
        printFizzBuzzRecursion(i + 1);
    }

    private void printFizzBuzzThatContainsThreeOrFive() {
        for (int i = 1; i <= 100; i++) {
            boolean isDivisibleOrContainsThree = i % 3 == 0 || i % 10 == 3 || i / 10 == 3;
            boolean isDivisibleOrContainsFive = i % 5 == 0 || i / 10 == 5;
            if (isDivisibleOrContainsThree && isDivisibleOrContainsFive) {
                System.out.println(i + " is FizzBuzz");
            } else if (isDivisibleOrContainsThree) {
                System.out.println(i + " is Fizz");
            } else if (isDivisibleOrContainsFive) {
                System.out.println(i + " is Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
