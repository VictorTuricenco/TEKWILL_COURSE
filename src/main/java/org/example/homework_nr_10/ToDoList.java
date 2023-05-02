package org.example.homework_nr_10;

import java.util.*;

public class ToDoList {

    public static void main(String[] args) {

        List<String> toDoListForToday = new ArrayList<>(Arrays.asList(
                "My TODO list for today:",
                "wake up at 07:30",
                "have breakfast",
                "brush my teeth",
                "go to work... no, f*ck that, I'm staying home!"
        ));

        toDoListForToday.forEach(e -> System.out.println(e));

        System.out.println("---List with unique values---");

        List<String> values = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "three", "four", "one"
        ));

        System.out.println(uniqueValue(values));

        System.out.println("---EN-RO dictionary---");

        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("second", "secunda");
        dictionary.put("minute", "minut");
        dictionary.put("hour", "ora");
        dictionary.put("day", "zi");
        dictionary.put("month", "luna");
        dictionary.put("year", "an");
        dictionary.put("century", "secol");
        dictionary.put("country", "tara");
        dictionary.put("city", "oras");
        dictionary.put("village", "sat");

        dictionary.forEach((e,i) -> System.out.println(e +" = " + i));

        System.out.println("---STACK---");

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println("---my TODO list without 'b'---");

        toDoListForToday.removeIf(e -> e.startsWith("b"));
        toDoListForToday.forEach(e -> System.out.println(e));

        System.out.println("---my TODO list with replaced 'ee' chars---");

        toDoListForToday.replaceAll(e -> e.contains("om") ? "replaced String" : e);
        toDoListForToday.forEach(e -> System.out.println(e));
    }


        public static Set<String> uniqueValue (List < String > values) {
            Set<String> newList = new LinkedHashSet<>(values);
            return newList;
        }
    }



