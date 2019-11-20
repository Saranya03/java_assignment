package com.java.assignment.Entities;

import com.java.assignment.Behaviours.Flyable;

public class Butterfly extends Animal implements Flyable {

    public void fly(){
        System.out.println("Hi, I am butterfly and I can fly");
    }
}
