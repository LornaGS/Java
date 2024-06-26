package com.qa.parent;

public abstract class Animal {

    public abstract String play();

    private String name;
    private boolean isCarnivore;

    public Animal(String name, boolean isCarnivore) {
        this.name = name;
        this.isCarnivore = isCarnivore;
    }

    public String getName() {
        return name;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarnivore(boolean carnivore) {
        isCarnivore = carnivore;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "name " + name  +
                ", isCarnivore " + isCarnivore
                ;
    }
}
