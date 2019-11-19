package com.java.assignment;

public class Chicken extends Bird {

    public void makeSound() {
        System.out.println("Cluck Cluck");
    }

    @Override
    public void fly() {
        throw new RuntimeException("I cannot fly, My wings are clipped");
    }
}
