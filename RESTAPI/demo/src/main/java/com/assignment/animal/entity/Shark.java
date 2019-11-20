package com.assignment.animal.entity;

public class Shark extends Fish {

    public Shark(){
        super("Large","Grey");
    }

    public void eatFish(){
        System.out.println("I eat other fish");
    }
}
