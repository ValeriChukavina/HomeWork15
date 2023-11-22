package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    String name;
    public Dog (String b) {
        this.name = b;

    }

    @Override
    public void sound() {
        System.out.println("I'am a Dog. My name " + this.name + ". Gav");
    }
}
