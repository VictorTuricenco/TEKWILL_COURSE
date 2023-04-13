package org.example.homework_nr_7;

public class Main {

    public static void main(String[] args) {

        Person any  = new Person("Ivan", "Susanin");
        Student student1 = new Student("John", "Doe", "Mechanics", 2022, 13000);
        Staff staff1 = new Staff("James", "Hetfield", "Hogwarts", 10000);

        System.out.println(any);
        System.out.println(student1);
        System.out.println(staff1);


        Circle circleSquare1 = new Circle(10);
        Square square1 = new Square(12);
        Cube cube1 = new Cube (4);
        Sphere sphere1 = new Sphere(5);

        System.out.println(circleSquare1.area());
        System.out.println(square1.area());
        System.out.println(cube1.area());
        System.out.println(cube1.volume());
        System.out.println(sphere1.area());
        System.out.println(sphere1.volume());

    }
}
