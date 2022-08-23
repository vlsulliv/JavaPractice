package com.strings;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        // declare variables
        String reverse = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >=0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // check if strings are equal
        if (str.equals(reverse)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args) {
        // input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String str = sc.nextLine(); // read the input string
        System.out.println("Standby for analysis...");
    }
}
