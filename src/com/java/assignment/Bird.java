package com.java.assignment;

public abstract class Bird extends Animal{

    public void fly(){
        System.out.println("I am flying");
    }

    public void sing(){
        System.out.println("I am singing");
    }

    public abstract void makeSound();
}
