package com.pouyaheydari.learning.lib;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        int a = 10;
        ArrayList<String> list = new ArrayList<>();
        list.add("Pouya"); // 0
        list.add("Amirhossein"); // 1
        list.add("Koroush"); // 2
        list.add("Zeynab"); // 3

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        }

        for (String name:list) {
            System.out.println(name);
        }
    }
}
