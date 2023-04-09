package org.example.homework_nr_6;

public class Main {

    public static void main ( String [] args) {

        Invoice invoice1 = new Invoice ("Tefal", "Iron", 2 , 550);

        System.out.println(invoice1.getAmount());

        Date date1 = new Date(0,0,0);
        date1.setDay(6);
        date1.setMonth(4);
        date1.setYear(2023);

        date1.displayDate();
    }
}
