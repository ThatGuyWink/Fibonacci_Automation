package com.todo;

import java.util.Scanner;

/**
 * This class defines methods for calculating Fibonacci numbers and includes a main method
 * for user interaction to retrieve specific terms of the Fibonacci sequence.
 */

public class Main {

    /**
     * Recursively calculates the nth term of the Fibonacci sequence.
     *
     * @param n the position in the Fibonacci sequence to retrieve.
     * @return the nth term of the Fibonacci sequence.
     */

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Main method to interact with the user and display the 'nth' term of the Fibonacci sequence.
     * The user is prompted to enter the term number they wish to retrieve. 10 is the preffered example.
     *
     * @param args not used.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the term in the Fibonacci sequence you want to find: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
        scanner.close();
    }
}

