package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with comma-separated values:");
        String input = scanner.nextLine();
        scanner.close();

        String sortedString = StringSorter.sortSubstringsAtCommas(input);
        System.out.println("Sorted string:");
        System.out.println(sortedString);
    }
}

class StringSorter {
    public static String sortSubstringsAtCommas(String input) {
        String[] substrings = input.split(",");
        Arrays.sort(substrings);
        return String.join(",", substrings);
    }
}
