package com.java.assignment.Entities;

public class ParrotFactory {

    public Parrot createParrot(String neightbour){
        if(neightbour.equalsIgnoreCase("Dog")){
            return new DogParrot();
        } else if(neightbour.equalsIgnoreCase("Cat")){
            return new CatParrot();
        }else if(neightbour.equalsIgnoreCase("Rooster")){
            return new RoosterParrot();
        } else {
            return null;
        }
    }
}
