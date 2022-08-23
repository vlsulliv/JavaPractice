package com.strings;

import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String str = sc.nextLine(); // read the input string
        System.out.println("Standby for analysis...");

        int vcount = 0, ccount = 0;

        //converting all the chars to lowercase
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vcount++;
            } else if((ch >= 'a'&& ch <= 'z')) {
            ccount++;
        }
        }
        System.out.println("Number of Vowels: " + vcount);
        System.out.println("Number of Consonants: " + ccount);
    }
}
