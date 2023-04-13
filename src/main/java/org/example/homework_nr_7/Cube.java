package org.example.homework_nr_7;

public class Cube extends ThreeDimensionalShape {

       public double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
