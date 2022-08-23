package com.strings;

import java.util.Scanner;

public class Words {
    String inputStr = "";
    private static int countWords(String input) {
        if (input == null)
            return 1;

        String[] words = input.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence : ");

        String inputStr = scanner.nextLine();
        System.out.println("Number of words : " + inputStr);

    }
}
