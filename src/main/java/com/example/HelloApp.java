package com.example;

public class HelloApp {
    public static void main(String[] args) {

        // Check if user provided input
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, User!");
        }
    }
}