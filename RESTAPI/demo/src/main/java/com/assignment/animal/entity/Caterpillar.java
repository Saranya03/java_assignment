package com.assignment.animal.entity;

public class Caterpillar extends Animal implements Walkable {

    @Override
    public void walk() {
        System.out.println("I am caterpillar and I can crawl!");
    }
}
