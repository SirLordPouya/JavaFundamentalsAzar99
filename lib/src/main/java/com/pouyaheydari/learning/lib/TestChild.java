package com.pouyaheydari.learning.lib;

public class TestChild extends TestParent {

    String family;

    public void sing(){
        name = "Pouya";
        family = "Heydari";
        printName();
        System.out.println("A beautiful song!");
    }

    public void sing(String name){
        this.name = name;
        family = "Heydari";
        printName();
        System.out.println("A beautiful song!");
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println(family);
    }
}
