package com.qa.model;
import java.util.*;
import
        java.util.HashMap
        ;

import
        java.util.List
        ;

import
        java.util.Map
        ;

import
        java.util.Map.*
        ;

public class Main {

    public static void main(String[] args) {


        Cat c = new Cat("Marms",5);

        Cat c2 = new Cat("Tickles", 6);
        Dog d = new Dog("Coco", 4);
        Dog d2 = new Dog("Snowy", 4);
        Rabbit r = new Rabbit("Rabbie", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);


        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(d2);
        animalList.add(r);
        animalList.add(r2);

        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(c);
        catList.add(c2);

        Set<Dog> dogList = new HashSet<>();
        dogList.add(d);
        dogList.add(d2);

        List<Rabbit> rabList = new ArrayList<>();
        rabList.add(r);
        rabList.add(r2);

        System.out.println("For Loop on ArrayList");
//        for (int x = 0; x < animalList.size(); x ++){
//            System.out.println(animalList.get(x));
//        }

//        System.out.println("For Loop on ArrayList");
//        for (int x = 0; x < catList.size(); x ++){
//            System.out.println(catList.get(x));
//        }

        for (Dog num : dogList) {
            System.out.println("NUM: " + num);
        }

        for (Rabbit num : rabList) {
            System.out.println("NUM: " + num);
        }
        Map<String, Animal> worldAnimals= new HashMap<>();

        worldAnimals.put(c.getName(), c);
        worldAnimals.put(c2.getName(), c2);
        worldAnimals.put(d.getName(), d);

        Map<Animal, String> worldAnimals2 = new HashMap<>();

        worldAnimals2.put(c , "c");
        worldAnimals2.put( c2, "c2");
        worldAnimals2.put(d, "d");

//        for (String key: worldAnimals.keySet()){
        for (Entry<String, Animal> key: worldAnimals.entrySet()){

//            System.out.println("Key: " + key + " Value : " + worldAnimals.get(key));
            System.out.println("Key: " + key + " Value : "  );
        }

    }
}
