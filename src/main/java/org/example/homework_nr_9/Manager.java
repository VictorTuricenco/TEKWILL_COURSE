package org.example.homework_nr_9;

public class Manager extends Employee implements AttendTraining, Interviewer {

    public Integer teamSize;

    public Manager(String name, String surname, Integer age, Integer teamSize) {
        super(name, surname, age);
        this.teamSize = teamSize;
    }


    @Override
    public void attendTraining() {
        System.out.println(name + " " + surname + " may attend training");
    }


    @Override
    public void doingInterview() {
        System.out.println(name + " " + surname + " is able to conduct an interview");

    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
