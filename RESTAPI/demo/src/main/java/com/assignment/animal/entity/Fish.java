package com.assignment.animal.entity;

public class Fish extends Animal implements Swimmers {

    public String size;
    public String color;

    public Fish(){

    }

    public Fish(String size,String color){
        this.size = size;
        this.color = color;
    }

    public void swim(){
        System.out.println("I am fish and I can swim");
    }
}
