package org.example.homework_nr_3;

public class TemperatureConverter {
    int tempC;
    int tempF;
        public static void main(String[] args){
            TemperatureConverter temp = new TemperatureConverter(20, 70);

            System.out.println(toCelsius(temp.tempF));
            System.out.println(toFahrenheit(temp.tempC));
        }
        public static int toCelsius (int tempF) {
            return (tempF - 32) * 5/9;
//            return tempCelsius;
        }
        public static int toFahrenheit (int tempC) {
        return (tempC * 9/5) + 32;
     }

    public TemperatureConverter(int tempC, int tempF) {
        this.tempC = tempC;
        this.tempF = tempF;
    }
}
