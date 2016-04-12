package com.example.green1.pleasedontbreaktest;

import java.util.ArrayList;
import java.util.Date;

import io.realm.RealmObject;

public class Assignment extends RealmObject
{
    private String name;
    private int day;
    private int month;
    private int year;

    /*public Assignment( int l, String n, double p, String t, int bT)
    {
        length = l;
        name = n;
        points = p;
        teacher = t;
        timeToStart = bT;
        isDone=false;
    }*/
    public Assignment()
    {

        name = "Michael in Russian";
        day = 1;
        month = 1;
        year = 2069;
    }
    public Assignment(String nameP, int dayP, int monthP, int yearP)
    {
        name = nameP;
        day = dayP;
        month = monthP;
        year = yearP;
    }


    public String getName()
    {
        return this.name;
    }



    public void setName(String paramString)
    {
        this.name = paramString;
    }



    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}