package com.assignment.animal.entity;

public class Chicken extends Bird {

    private boolean isRooster;

    public Chicken(){
        this.isRooster = false;
    }

    public Chicken(boolean isRooster){
        this.isRooster = isRooster;
    }

    public void makeSound() {
        if(isRooster){
            System.out.println("Cock-a-doodle-doo");
        } else {
            System.out.println("Cluck Cluck");
        }
    }

    @Override
    public void fly() {
        throw new RuntimeException("I cannot fly, My wings are clipped");
    }
}
