package com.example.green1.pleasedontbreaktest;

import java.util.ArrayList;
import java.util.Date;

import io.realm.RealmObject;

public class Assignment extends RealmObject
{
    private int difficulty;
    private Date dueDate;
    private boolean isDone;
    private int length;
    private String name;
    private double points;
    private String teacher;
    private int timeToStart;
    private int day;
    private int month;
    private int year;

    public Assignment( int l, String n, double p, String t, int bT)
    {
        length = l;
        name = n;
        points = p;
        teacher = t;
        timeToStart = bT;
        isDone=false;
    }

    public Assignment(String nameP, int dayP, int monthP, int yearP)
    {
        name = nameP;
        day = dayP;
        month = monthP;
        year = yearP;
    }




    public int getDifficulty()
    {
        return this.difficulty;
    }

    public Date getDueDate()
    {
        return this.dueDate;
    }

    public int getLength()
    {
        return this.length;
    }

    public String getName()
    {
        return this.name;
    }


    public double getPoints()
    {
        return this.points;
    }

    public String getTeacher()
    {
        return this.teacher;
    }

    public int getTimeToStart()
    {
        return this.timeToStart;
    }

    public void setDifficulty(int paramInt)
    {
        this.difficulty = paramInt;
    }

    public void setDueDate(Date paramDate)
    {
        this.dueDate = paramDate;
    }

    public void setLength(int paramInt)
    {
        this.length = paramInt;
    }

    public void setName(String paramString)
    {
        this.name = paramString;
    }


    public void setPoints(double paramDouble)
    {
        this.points = paramDouble;
    }

    public void setTeacher(String paramString)
    {
        this.teacher = paramString;
    }

    public void setTimeToStart(int paramInt)
    {
        this.timeToStart = paramInt;
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