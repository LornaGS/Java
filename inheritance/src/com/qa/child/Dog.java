package com.qa.child;

import com.qa.parent.Animal;


public class Dog extends Animal {

    private int age;

    //extends from animal and uses the variables from parent class animal
    public Dog(String name, boolean isCarnivore, int age) {
      super( name, isCarnivore);
      this.age=age;
    }

    @Override
    public String play() {
        return "let play";
    }

    @Override
    public String toString() {
        return "Dog " +
                "age=" + age +
                super.toString();
    }
}
