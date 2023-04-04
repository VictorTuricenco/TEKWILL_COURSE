package org.example.homework_nr_5;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

//    public boolean isWeekday() {
//        if (this != SATURDAY && this != SUNDAY) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean isHoliday() {
//        return this == SATURDAY || this == SUNDAY;
//    }
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
// Enum автоматом определяется как array? Если нет, то как его правильно сделать массивом?













