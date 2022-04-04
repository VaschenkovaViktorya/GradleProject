package ru.myproject;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class ProjectApp {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LocalTime currentTime= new LocalTime();
        LocalDate currentDate= new LocalDate();
        System.out.println("The current local time is "+ currentTime);
        System.out.println("The current local date "+  currentDate);
    }
}
