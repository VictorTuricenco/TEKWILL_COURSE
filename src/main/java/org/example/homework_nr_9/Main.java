package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Bruce", "Lee", 30, "Java");
        Programmer programmer2 = new Programmer("Chuck", "Norris", 52, "Go");
        Manager manager1 = new Manager("Steven", "Seagal", 50, 10);

        List<Employee> listEmployees = new ArrayList<>(Arrays.asList(
                programmer1,
                programmer2,
                manager1
        ));

        for (Employee element : listEmployees) {
            if (element instanceof Interviewer)
                ((Interviewer) element).doingInterview();
        }

        System.out.println("_______________________________________________");

        MeetingRoom newMeeting = new MeetingRoom(listEmployees);

        newMeeting.timeToLearn();


        System.out.println("------------------------------------------------");

        for (Employee element : listEmployees) {
            System.out.println(element.toString());
        }


    }
}
