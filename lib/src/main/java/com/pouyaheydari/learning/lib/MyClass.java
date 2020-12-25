package com.pouyaheydari.learning.lib;


public class MyClass {


    int age = 30;
    int number = 23334;
    double pi = 3.14;
    double d = 54654.146565;
    boolean isMale = false;
    boolean isAdult = true;
    String name = "Pouya";
    String website = "https://pouyaheydari.com";
    float f = 3.14f;
    byte b = 20;
    short s = 100;
    long l = 546546546;
    char c = 'P';
    boolean isStudent;


    public static void main(String[] args) {
        int age = calculateAge(1990);
        boolean b = 2 * 2 <= 4;
        System.out.println(age);
    }

    public static int calculateAge(int birthYear) {
        int thisYear = getCurrentYear();
        int result = thisYear - birthYear;
        return result;
    }

    public void printName(String name) {
        System.out.println(name);
    }

    public static int getCurrentYear() {
        int result = 2020;
        return result;
    }

    public static void printHello() {
        System.out.println("Hello!");
    }
}