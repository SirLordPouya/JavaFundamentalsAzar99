package com.pouyaheydari.learning.lib;

public class TestSwitchCase {

    public static void main(String[] args) {
        int userInput = 10;

        switch (userInput) {
            case 1:
                System.out.println("Setting");
                break;
            case 2:
                System.out.println("Play");
                break;
            case 3:
                System.out.println("History");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Please enter a valid number (1 to 4)");
        }


    }
}
