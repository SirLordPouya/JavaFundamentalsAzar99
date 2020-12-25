package com.pouyaheydari.learning.lib;

import java.util.Scanner;

public class TestScanner {


    // intelliJ Idea
    // Eclipse
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Welcome " + name + " " + age);
    }
}
