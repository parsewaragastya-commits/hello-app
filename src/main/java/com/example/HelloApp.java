package com.example;

public class HelloApp {
    public static void main(String[] args) {

        // Assign name or default "World"
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}