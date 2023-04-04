package org.example.homework_nr_5;

public class HomeWork5 {


    public static void main (String [] args) {

        for (int index = 0; index != Months.values().length; index++){
            System.out.println(Months.values()[index]);
        }

            System.out.println(Weekday.THURSDAY.isHoliday());


        String str = "true";
        boolean bl = Boolean.parseBoolean(str);

        String str1 = "120";
        byte bt = Byte.parseByte(str1);

        String str2 = "3200";
        short st = Short.parseShort(str2);

        String str3 = "147895632";
        int in = Integer.parseInt(str3);

        String str4 = "987654321987654321";
        long lg = Long.parseLong(str4);

        String str5 = "4444.5d";
        double db = Double.parseDouble(str5);

        String str6 = "2354.56f";
        float fl = Float.parseFloat(str6);

    }
}
