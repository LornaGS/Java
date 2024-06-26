package com.qa;

import com.qa.object.Person;

public class Main {
    public static void main(String[] args) {

        Person lorna = new Person("Lorna", 27, "water");

        Person jeremy = new Person("jerem", 27, "coke");
        lorna.printHello();
        lorna.setName("GS");
        System.out.println((lorna.getName()));
    }



}
