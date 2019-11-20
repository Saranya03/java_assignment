import com.java.assignment.Behaviours.Flyable;
import com.java.assignment.Behaviours.Swimmers;
import com.java.assignment.Behaviours.Walkable;
import com.java.assignment.Entities.*;

import java.util.Arrays;

public class Solution {
    public static void main(String args[]){

        Duck duck = new Duck();
        duck.makeSound();
        duck.swim();

        Chicken chicken = new Chicken();
        chicken.makeSound();
       // chicken.fly(); // throws Exception

        Rooster rooster = new Rooster();
        rooster.makeSound();

        Chicken roosterChicken = new Chicken(true);
        roosterChicken.makeSound();

        Chicken henChicken = new Chicken();
        henChicken.makeSound();

        DogParrot dogParrot = new DogParrot();
        dogParrot.makeSound();

        CatParrot catParrot = new CatParrot();
        catParrot.makeSound();

        RoosterParrot roosterParrot = new RoosterParrot();
        roosterParrot.makeSound();

        ParrotFactory parrotFactory = new ParrotFactory();
        Parrot dogParrot1 = parrotFactory.createParrot("Dog");
        dogParrot1.makeSound();

        Parrot catParrot1 = parrotFactory.createParrot("Cat");
        catParrot1.makeSound();

        Parrot roosterParrot1 = parrotFactory.createParrot("Rooster");
        roosterParrot1.makeSound();

        Fish fish = new Fish();
        fish.swim();

        Shark shark = new Shark();
        shark.eatFish();
        System.out.println("Shark is " + shark.size + " and " + shark.color + " in color.");

        ClawnFish clawnFish = new ClawnFish();
        clawnFish.makeJoke();
        System.out.println("Clown fish is " + clawnFish.size + " and " + clawnFish.color + " in color.");

        Dolphin dolphin = new Dolphin();
        dolphin.swim();

        Butterfly butterfly = new Butterfly();
        butterfly.fly();

        Caterpillar caterpillar = new Caterpillar();
        caterpillar.walk();

        Animal[] animals = new Animal[]{
                new Duck(),
                new Chicken(),
                new Rooster(),
                new DogParrot(),
                new CatParrot(),
                new RoosterParrot(),
                new Fish(),
                new Shark(),
                new ClawnFish(),
                new Dolphin(),
                new Butterfly()
        };

        int swim_count;
        int fly_count;
        int walk_count;
        int sing_count;

        swim_count = (int) Arrays.stream(animals).filter(animal -> animal instanceof Swimmers).count();
        fly_count = (int) Arrays.stream(animals).filter(animal -> animal instanceof Flyable).count();
        walk_count = (int) Arrays.stream(animals).filter(animal -> animal instanceof Walkable).count();
        sing_count = (int) Arrays.stream(animals).filter(animal -> animal instanceof Bird).count();

        System.out.println(" Swim Count  : " + swim_count);
        System.out.println(" Fly Count  : " + fly_count);
        System.out.println(" Walk Count  : " + walk_count);
        System.out.println(" Bird Count  : " + sing_count);

        Rooster rooster2 = new Rooster("Danish");
        rooster2.makeSound();

    }
}
