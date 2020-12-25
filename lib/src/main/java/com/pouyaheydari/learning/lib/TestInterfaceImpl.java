package com.pouyaheydari.learning.lib;

public class TestInterfaceImpl implements TestInterface {

    @Override
    public void printName(String name) {
        System.out.println(name);
    }

    @Override
    public int calculateAge(int birthYear) {
        return 2020 - birthYear;
    }
}
