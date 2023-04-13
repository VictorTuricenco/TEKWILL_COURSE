package org.example.homework_nr_7;

public class Square extends TwoDimensionalShape {

    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
