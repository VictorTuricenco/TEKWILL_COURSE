package org.example.homework_nr_4;

public class HomeWork4 {


    public static void main(String[] args) {

        int[] myArray = new int[]{5, 18, 35, 20, 10, 8, 41, 55};
        for (int i = 0; i != myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println("===========================================");

        int[] singleA = {1, 3, 5, 6, 8, 10, 13, 16};

        double sum = 0;
        for (int i = 0; i != singleA.length; i++) {
            sum += singleA[i];
        }
        System.out.println("Sum of the elements " + "= " + sum);
        double average = sum / singleA.length;

        System.out.println("Average value " + "= " + average);

        // Multidimensional array
        int[][] biA = new int[][]{
                {10, 35, 2, 15, 31},
                {7, 3, 8, 65, 115, 80},
                {1, 11, 6, 17}
        };

        int count = 0;
        int countOdd = 0;
        for (int j = 0; j != biA.length; j++) {
            for (int i = 0; i != biA[j].length; i++) {
                if (biA[j][i] % 2 == 0) {
                    count++;
                } else {
                    countOdd++;
                }
            }
        }
        System.out.println("Count even " + count);
        System.out.println("Count odd " + countOdd);


        //Array "String" type
        String[] stringA = new String[]{"Alex", "Den", "Mircea", "Eugene", "Mark"};
        for (int i = 0; i != stringA.length; i++) {
            System.out.println(stringA[i]);
        }

        System.out.println("===========================================");

        String[] stringB = stringA;
            for (int i = 0; i != stringB.length; i++) {
            System.out.println(stringB[i]);
        }
    }
}

