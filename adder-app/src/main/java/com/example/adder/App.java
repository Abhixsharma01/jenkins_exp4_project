package com.example.adder;

public class App {
    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length < 2) {
            System.out.println("Please provide two integers as arguments.");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Sum is: " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}