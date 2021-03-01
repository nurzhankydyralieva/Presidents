package kg.megacom.presidents;

import kg.megacom.enums.WeekDays;

import java.time.*;
import java.util.EnumSet;

public class President {
    private String name;
    private LocalDateTime localDateTime;
    private WeekDays weekDays;

    public President(String name, LocalDateTime localDateTime, WeekDays weekDays) {
        this.name = name;
        this.localDateTime = localDateTime;

        this.weekDays = weekDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public WeekDays getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    public int getFlight(int distance, int quantityOfKm) {
        int sum = distance * quantityOfKm;
        return sum;
    }

    public void getInstant() {
        //Instant class is used to represent a specific moment on the time line
        Instant currTimeStamp = Instant.now();
        System.out.println("current timestamp: " + currTimeStamp);
        // get current time in milli seconds
        System.out.println("current time in milli seconds: " + currTimeStamp.toEpochMilli());
        // get current time in unix time
        System.out.println("current time in unix time: " + currTimeStamp.getEpochSecond());
        //parsing date from ISO 8601
        Instant strToDate = Instant.parse("2021-03-01T12:00:00Z");
        System.out.println("string to date conversion: " + strToDate);
    }

    public void getWorkDays() {
        System.out.print("Day off: ");
        for (WeekDays day : EnumSet.of(WeekDays.SATURDAY, WeekDays.SUNDAY)) {
            System.out.print(day + " ");
        }
        System.out.println();
        System.out.print("Work days: ");
        for (WeekDays workDays : EnumSet.range(WeekDays.MONDAY, WeekDays.FRIDAY)) {
            System.out.print(workDays + " ");
        }
        System.out.println();
    }

    public void workedYears(int years, int month) {
        int sum = years * month;
        System.out.println("Worked time as a president: " + sum + " months or " + years + " years");
    }

    @Override
    public String toString() {
        return "President " +
                "name='" + name + '\'' +
                ", localDateTime=" + localDateTime +
                ", weekDays=" + weekDays;
    }
}

