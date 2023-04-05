package org.example;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }
    private static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= input; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0)
                System.out.print( "Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            System.out.println();
        }
    }
}
