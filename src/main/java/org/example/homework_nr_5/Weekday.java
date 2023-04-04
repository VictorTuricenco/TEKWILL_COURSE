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
        if (this != SATURDAY && this != SUNDAY) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }
}










