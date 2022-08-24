package com.strings;

import java.util.Scanner;

public class RotateString {

    static String left(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    static String right(String str4, int d)
    {
        return left(str4, str4.length() - d);
    }

    public static void main(String[] args) {
        // input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String str = sc.nextLine(); // read the input string
        System.out.println("Standby for analysis...");

        System.out.println(str);

        System.out.println(right(str,3));
    }
}
