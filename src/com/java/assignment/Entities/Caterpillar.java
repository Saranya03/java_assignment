package com.java.assignment.Entities;

import com.java.assignment.Behaviours.Walkable;

public class Caterpillar extends Animal implements Walkable {

    @Override
    public void walk() {
        System.out.println("I am caterpillar and I can crawl!");
    }
}
