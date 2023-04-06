package org.example.homework_nr_5;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

        public boolean isWeekday() {
            for (int index = 0; index != Weekday.values().length; index++)
                return Weekday.values()[index] != SATURDAY && Weekday.values()[index] != SUNDAY;
            return false;
        }

        public boolean isHoliday() {
            for (int index = 0; index != Weekday.values().length; index++)
                return Weekday.values()[index] == SATURDAY || Weekday.values()[index] == SUNDAY;
            return false;
        }
}














