package com.qa.child;

import com.qa.parent.Animal;

public class Cat extends Animal {

    @Override
    public String play(){
        return "I dont want too";

    }

    public Cat(String name, boolean isCarnivore) {
        super(name, isCarnivore);
    }
}
