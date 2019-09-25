package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDateOfAWeek {
    public static void main(String[] args) {
        int dayDiff = 7-1;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(cal.getTime()));

        cal.add(Calendar.DATE, dayDiff);

        System.out.println(df.format(cal.getTime()));
    }
}
