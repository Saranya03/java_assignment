import com.java.assignment.*;

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

    }
}
