/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;
// class to contain solution03 code
public class Solution03 {
     // Creating scanner once to parse input values
     static Scanner in = new Scanner(System.in);
     // main driver method
    public static void main(String[] args) {
        // Will condense code into main due to simplicity and clarity/time
        // Initialize str and str2 to be assigned to input values
        // separate print statements asking for user input

        String str;
        System.out.print("What is the quote? ");
        str = in.nextLine();

        System.out.print("Who said it? ");
        String str2 = in.nextLine();

        //  char quotes declared to wrap around str one
        // will show as " str "
        char quotes = '"';
        // single output statement used with concat method
        System.out.println(str2 + " says, " + quotes + str + quotes);
    }

}
