package org.example.enums;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static boolean isWeekDay(Weekday weekday) {
        return weekday != SATURDAY && weekday != SUNDAY;
    }

    public static boolean isHoliday(Weekday weekday) {
        return weekday == SATURDAY || weekday == SUNDAY;
    }
}
