package org.example.homework_nr_9;


import java.util.List;

public class MeetingRoom {

    private List<Employee> newList;

    public MeetingRoom(List<Employee> listEmployees) {
        this.newList = listEmployees;
    }

    public void timeToLearn() {
        for (Employee element : newList) {
            if (element instanceof AttendTraining)
                ((AttendTraining) element).attendTraining();
        }
    }
}
