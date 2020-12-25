package com.pouyaheydari.learning.lib;

public class TestAbstractChild extends TestAbstractClass {
    @Override
    int calculateAge(int birthYear) {
        return 2020 - birthYear;
    }
}
