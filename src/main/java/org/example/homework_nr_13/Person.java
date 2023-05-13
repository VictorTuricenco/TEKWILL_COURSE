package org.example.homework_nr_13;

import org.example.homework_nr_13.exceptions.InvalidAgeException;
import org.example.homework_nr_13.exceptions.InvalidNameException;

public class Person {

    private String firstName;
    private String  lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) throws InvalidNameException, InvalidAgeException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        if (firstName == null || lastName == null || firstName.equals(" ") || lastName.equals(" ")) {
            throw new InvalidNameException(" The FIRST NAME and the LAST NAME fields must not be empty");
        }
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("The Age value is not valid");
            }
        }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

