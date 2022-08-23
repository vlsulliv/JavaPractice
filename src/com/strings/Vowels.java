package com.strings;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        System.out.println("This program will compute the number of vowels from your sentence.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String str = sc.nextLine(); // read the input string
        System.out.println("Standby for analysis...");
    }
}
