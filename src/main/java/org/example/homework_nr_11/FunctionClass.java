package org.example.homework_nr_11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionClass {
    static String vowels = "aeiouAEIOU";
    static String numbers = "0123456789";


    public static void main(String[] args) {

        System.out.println("---Consonant count---");

        Function<String, Integer> consonantCount = (e) -> {
            int count = 0;
            for (int i = 0; i < e.length(); ++i) {
                if (vowels.indexOf(e.charAt(i)) < 0 && e.charAt(i) != ' ') {
                    count++;
                }
            }
            return count;
        };

        System.out.println(consonantCount.apply("In God we trust"));
        System.out.println(consonantCount.apply("Truck is towing a car"));

        System.out.println("---Vowels count---");

        Function<String, Integer> vowelsCount = (e) -> {
            int count = 0;
            for (int i = 0; i < e.length(); ++i) {
                if (vowels.indexOf(e.charAt(i)) != -1) {
                    count++;
                }
            }
            return count;
        };

        System.out.println(vowelsCount.apply("bla bla blaaaaa"));

        System.out.println("---Numbers count---");


        Function<String, Integer> numberCount= (e) -> {
            int count = 0;
            for (int i = 0; i < e.length(); ++i) {
                if (numbers.indexOf(e.charAt(i)) != -1) {
                    count++;
                }
            }
            return count;
        };

        System.out.println(numberCount.apply("We are now in 2023"));


        System.out.println("---Even/odd---");

        Function<String,String> charCount = (e) -> {
            int count = 0;
            for (int i = 0; i < e.length(); ++i) {
                count ++;
            }
                if (count % 2 == 0)
                   return null;
                else
                    return String.valueOf(e.charAt(0));
            };
                  
        System.out.println(charCount.apply("How much is the fish?"));


        System.out.println("---Using functional interfaces with collections---");


        List<String> strings = new ArrayList<>(Arrays.asList(
                "Today is the best day",
                "It is my birthday",
                "it is 23rd of May 2023"
        ));

        System.out.println(vowelsCount.apply(strings.toString()));

        }
    }


