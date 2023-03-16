package org.example.homework_nr_1;


public class HomeWork1 {

    public static void main(String[] args){
        System.out.println("Helo World!");

        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;
        char FirstLetterInAlphabet = 'A';
        boolean JavaIsAmazing = true;
        float Pi = 3.14159F;


        System.out.println(CurrentWorldPopulation);
        System.out.println(CarsProducedThisYear);
        System.out.println(FirstLetterInAlphabet);
        System.out.println(JavaIsAmazing);
        System.out.println(Pi);


        //Как я понимаю, если не ставить F в double, то просто выводится введенное число, бех "хвоста"
        double Price = 235.15F;
        double Tax = 15.80F;
        int Quantity = 5680;
        double Sum = 0F;

        System.out.println(Price);
        System.out.println(Tax);
        System.out.println(Quantity);
        System.out.println(Sum);

        double Total = Price+Tax*Quantity+Sum;
        System.out.print(Total);

    }
}
