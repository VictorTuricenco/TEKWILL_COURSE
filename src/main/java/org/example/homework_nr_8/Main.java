package org.example.homework_nr_8;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Elephant("mammal", "land", "African", 4, "huge");
        Herbivore animal2 = new Elephant("mammal", "land", "Asian", 4, "small");

        animal1.eat();
        Animal.humans();
        animal1.test();
        animal2.test();
        System.out.println(animal1);
        System.out.println("----------------------------------");
        ((Elephant) animal1).noseSize();
        animal2.diet();

    }

}
