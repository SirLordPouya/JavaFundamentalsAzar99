package com.pouyaheydari.learning.lib;

public abstract class TestAbstractClass {

    String name;

    public void printName() {
        System.out.println(name);
    }

    abstract int calculateAge(int birthYear);
}
