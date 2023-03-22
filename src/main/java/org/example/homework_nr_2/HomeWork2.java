package org.example.homework_nr_2;

public class HomeWork2 {

    public static void main(String[] args) {

        int month = 8;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }


        for (int i = 100; i <= 1000; i++)
            if(i % 5 == 0) {
                System.out.println(i);
            }



        double sum = 0;
        for (double a = 1, b = a + 2; a <= 97; a += 2, b += 2) {
            sum += a / b;
        }
        System.out.println("Sum" + " = " + sum);




        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    }








