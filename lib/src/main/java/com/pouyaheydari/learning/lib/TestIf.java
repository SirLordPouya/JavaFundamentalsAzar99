package com.pouyaheydari.learning.lib;

public class TestIf {

    public static void main(String[] args) {

        int age = 81;
        boolean isMale = false;
        boolean isRich = true;

        if (age <= 12) {
            System.out.println("Kid");
        } else if (age <= 19) {
            System.out.println("Teen");
        } else if (age <= 40) {
            System.out.println("Young");
        } else if (age <= 80) {
            System.out.println("Mid Age");
        } else {
            System.out.println("Old");
        }

        if (age >= 18 && isMale == false){
            System.out.println("Hello Ms.");
        }

        if (age >=18 && isMale == true){
            System.out.println("Hello Mr.");
        }

        if (age>=18 || isRich == true){
            System.out.println("Welcome!");
        }



    }
}
