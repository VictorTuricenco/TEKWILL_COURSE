package org.example.homework_nr_11;

import java.util.function.Predicate;

public class PredicateClass {

    public static void main(String[] args) {

        System.out.println("---Palindrome---");

        Predicate<String> palindrome = (e) -> {
             e = e.toLowerCase();
             String reverseStr = "";
            for ( int i = e.length() -1; i >= 0; i-- )
                reverseStr = reverseStr + e.charAt(i);
                if (e.equals(reverseStr))
                    return true;
                 else
                    return false;
            };

        System.out.println(palindrome.test("Panama"));

        System.out.println("---Prime number---");

        Predicate<Integer> isPrime = (e) -> {
            if (e <=1)
                return false;
            for (int i = 2; i < e; i++)
                if (e % i == 0)
                    return false;
            return true;
        };

        System.out.println(isPrime.test(521));
        }
    }
