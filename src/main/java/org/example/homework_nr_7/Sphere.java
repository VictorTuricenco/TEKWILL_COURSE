package org.example.homework_nr_7;

public class Sphere extends ThreeDimensionalShape {

    public double radius;


    public Sphere(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return 4 * Math.PI * radius * radius;
    }
}
