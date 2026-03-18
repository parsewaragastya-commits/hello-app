package com.example;

public class HelloApp {
    public static void main(String[] args) {

        String result;

        if (args.length > 0) {
            // Join all names with comma
            result = String.join(", ", args);
        } else {
            result = "World";
        }

        System.out.println("Hello, " + result + "!");
    }
}