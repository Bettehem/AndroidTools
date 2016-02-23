package com.github.bettehem.androidtools.misc;

import java.util.Calendar;
import java.util.Date;

public class Time implements Comparable<Time>{
    public String year;
    public String month;
    public String date;
    public String hour;
    public String minute;
    public String second;

    public Time(Calendar date) {
        year = checkValue(date.get(Calendar.YEAR));
        month = checkValue(date.get(Calendar.MONTH) + 1);
        this.date = checkValue(date.get(Calendar.DATE));
        hour = checkValue(date.get(Calendar.HOUR_OF_DAY));
        minute = checkValue(date.get(Calendar.MINUTE));
        second = checkValue(date.get(Calendar.SECOND));
    }

    public Time(int year, int month, int date, int hour, int minute, int second){
        this.year = checkValue(year);
        this.month = checkValue(month);
        this.date = checkValue(date);
        this.hour = checkValue(hour);
        this.minute = checkValue(minute);
        this.second = checkValue(second);
    }

    public Time(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        year = checkValue(calendar.get(Calendar.YEAR));
        month = checkValue(calendar.get(Calendar.MONTH) + 1);
        this.date = checkValue(calendar.get(Calendar.DATE));
        hour = checkValue(calendar.get(Calendar.HOUR_OF_DAY));
        minute = checkValue(calendar.get(Calendar.MINUTE));
        second = checkValue(calendar.get(Calendar.SECOND));
    }

    private String checkValue (int date){
        if (date < 10){
            return "0" + date;
        }else{
            return String.valueOf(date);
        }
    }

    public long getTimeInMillis(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date), Integer.parseInt(hour), Integer.parseInt(minute), Integer.parseInt(second));
        return calendar.getTimeInMillis();
    }

    @Override
    public int compareTo(Time time) {
        //check if null
        if (time == null) {
            throw new NullPointerException("anotherCalendar == null");
        }

        //create Calendar object
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(time.year), Integer.parseInt(time.month), Integer.parseInt(time.date), Integer.parseInt(time.hour), Integer.parseInt(time.minute), Integer.parseInt(time.second));

        //get the time in milliseconds
        long timeInMillis = getTimeInMillis();

        //get the comparable time in milliseconds
        long anotherTimeInMillis = time.getTimeInMillis();
        if (timeInMillis > anotherTimeInMillis) {
            return 1;
        }
        if (timeInMillis == anotherTimeInMillis) {
            return 0;
        }
        return -1;
    }
}
