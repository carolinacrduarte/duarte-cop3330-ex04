/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine(); //Reads the noun input.
        System.out.print("Enter a verb: ");
        String verb = input.nextLine(); //Reads the verb input.
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine(); //Reads the adjective input.
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine(); //Reads the adverb input.

        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb));

    }
}
