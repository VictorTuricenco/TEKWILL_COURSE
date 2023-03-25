package org.example.homework_nr_3;

public class Circle {
    int radius;

    public static void main(String[] args) {
        Circle area = new Circle(20);
        System.out.println(calculateArea(area.radius));
    }

    public static double calculateArea(int radius) {
        double Pi = 3.1415926536;
        return Pi * radius * radius;
     }

    public Circle(int radius) {
        this.radius = radius;
    }

   }
