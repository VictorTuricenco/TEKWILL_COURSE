package org.example.homework_nr_8;

import java.sql.SQLOutput;

public class Elephant extends Herbivore implements Animal {

    public String type;
    public String area;

    public String specie;

    public Integer nrOfLegs;

    public String ears;


    public Elephant(String type, String area, String specie, Integer nrOfLegs, String ears) {
        this.type = type;
        this.area = area;
        this.specie = specie;
        this.nrOfLegs = nrOfLegs;
        this.ears = ears;
    }


    @Override
    public void noseSize() {
        System.out.println("Elephants have long nose");
    }

    @Override
    public void eat() {
        System.out.println("Elephants eat plants");
    }

    @Override
    public void test() {
        if (ears.equals("huge")) {
            System.out.println("This is an African elephant");
        } else {
            System.out.println("This is an Asian elephant");
        }
        ;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "type='" + type + '\'' +
                ", area='" + area + '\'' +
                ", specie='" + specie +
                ", nrOfLegs=" + nrOfLegs +
                ", ears='" + ears + '\'' +
                '}';
    }
}


