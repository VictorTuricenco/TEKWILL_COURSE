package org.example.homework_nr_8;

public interface Animal {


    default void eat() {
        System.out.println("All animals eat something");
    }

    static void humans() {
        System.out.println("Humans are not animals");
    }

    void test();

    String toString();
}
