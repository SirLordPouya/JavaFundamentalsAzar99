package com.pouyaheydari.learning.lib;

public class TestObject {


    public static void main(String[] args) {

        TestCar car1 = new TestCar("Pride",2020,"Saipa",60);

        TestCar car2 = new TestCar("Samand",2020,"IK",80);


        System.out.println(car1.getName() + car1.getYear() + car1.getCompany());
        System.out.println(car2.getName() + car2.getYear() + car2.getCompany());
    }
}
