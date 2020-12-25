package com.pouyaheydari.learning.lib;

public class TestCar {

    public TestCar(String name, int year, String company, int enginePower) {
        this.name = name;
        this.year = year;
        this.company = company;
        this.enginePower = enginePower;
    }

    private String name;
    private int year;
    private String company;
    private int enginePower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
