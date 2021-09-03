/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*
 *  Pseudocode:
 *  import java scanner class
 *  set up scanner object "input" to receive string input from user
 *  Ask user to input their name
 *  String "name" variable receives input string
 *  Concatenate received name into greeting
 *  Display greeting to user
 *
 */

package exercise01;
import java.util.Scanner;
public class Solution01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");

        String name = input.nextLine();

        String output = "Hello, " + name + ", nice to meet you!";

        System.out.println(output);
    }
}