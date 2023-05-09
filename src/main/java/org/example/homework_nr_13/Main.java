package org.example.homework_nr_13;

import org.example.homework_nr_13.exceptions.IllegalArgumentException;
import org.example.homework_nr_13.exceptions.InvalidAgeException;
import org.example.homework_nr_13.exceptions.InvalidNameException;
import org.example.homework_nr_13.exceptions.InvalidRangeException;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException, InvalidRangeException {

        try {
            Person person1 = new Person("Ion", "Popa", 20);
            Person person2 = new Person("Vasile", "Topa", 30);
            Person person3 = new Person(" ", "Musteata", 160);


        } catch (InvalidAgeException | InvalidNameException e) {
            System.out.println("WARNING:" + e.getMessage());
        }

        Numbers num1 = new Numbers(10,2);

        System.out.println(num1.divisionBy());

        System.out.println(countDivisibleBy7Numbers(6,21));


    }
    public static int countDivisibleBy7Numbers (int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        int count = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++)
            if (i % 7 == 0) {
                count ++;
            }
        if (inferiorLimit > superiorLimit)
            throw new InvalidRangeException();

        return count;
    }


    }

