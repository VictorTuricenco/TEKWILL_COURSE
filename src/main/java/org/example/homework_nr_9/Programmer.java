package org.example.homework_nr_9;

public class Programmer extends Employee implements AttendTraining {

    public String progLang;

    public Programmer(String name, String surname, Integer age, String progLang) {
        super(name, surname, age);
        this.progLang = progLang;
    }


    @Override
    public void attendTraining() {
        System.out.println(name + " " + surname + " may attend training");

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "progLang='" + progLang + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
