package com.qa.object;

public class Person {

    //fields for every person obj I instantiate it will have these fields
    //when we create fields we want to make them private
    //for every filed youll have a get method and set mehtod for your fields
    //you can have obj in obj

    private String name;
    private int age;
    private String favourDrink;

    @Override
    public String toString() {
        return "Person: " +
                "name: '" + name + '\'' +
                ", age=" + age +
                ", favourDrink='" + favourDrink + '\'' +
                '}';
    }


//methods

    //default contstructor - will give you this as the only option unless you pass variables in and any number of the above fields can be added
    // cant istatiate the same constructor with the same variables - you must change the order - but what is this needed for?
    public Person(){}

    public Person (String name, int age, String favourDrink){
        this.name = name;
        this.age = age;
        this.favourDrink = favourDrink;

    }

    public String getName(){
        return this.name;

    }

    public void setName (String name){
        this.name = name;
    }

    public void printHello() {

        System.out.println("hello" + name);
    }
}
