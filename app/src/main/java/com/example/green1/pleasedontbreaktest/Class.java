package com.example.green1.pleasedontbreaktest;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class implements Parcelable {
    private double GPA;
    private ArrayList<Assignment> GradeList = new ArrayList<Assignment>();
    private boolean isGreen;
    private String[] materialList;
    private String name;
    private int period;
    private int startHour;
    private int startMins;
    private String teacher;
    private String AmPm;

    public Class(String paramString, int paramInt1, int paramInt2, int p, String Ap)
    {
        this.name = paramString;
        this.startHour = paramInt1;
        this.startMins = paramInt2;
        AmPm = Ap;
        period = p;
    }

    public Class(String[] paramArrayOfString, String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2)
    {
        this.materialList = paramArrayOfString;
        this.name = paramString1;
        this.period = paramInt1;
        this.startHour = paramInt2;
        this.startMins = paramInt3;
        this.teacher = paramString2;


    }

    protected Class(Parcel in) {
        GPA = in.readDouble();
        isGreen = in.readByte() != 0;
        materialList = in.createStringArray();
        name = in.readString();
        period = in.readInt();
        startHour = in.readInt();
        startMins = in.readInt();
        teacher = in.readString();
    }

    public static final Creator<Class> CREATOR = new Creator<Class>() {
        @Override
        public Class createFromParcel(Parcel in) {
            return new Class(in);
        }

        @Override
        public Class[] newArray(int size) {
            return new Class[size];
        }
    };

    public double getGPA()
    {
        return this.GPA;
    }

    public ArrayList<Assignment> getGradeList()
    {
        return this.GradeList;
    }

    public String getName()
    {
        return this.name;
    }

    public int getPeriod()
    {
        return this.period;
    }

    public int getStartHour()
    {
        return this.startHour;
    }

    public int getStartMins()
    {
        return this.startMins;
    }

    public String getTeacher()
    {
        return this.teacher;
    }

    public boolean isGreen()
    {
        return this.isGreen;
    }

    public void rewind(int paramInt)
    {
        Object localObject = Calendar.getInstance(TimeZone.getDefault()).getTime();
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("mm");
        localSimpleDateFormat.setTimeZone(TimeZone.getDefault());
        localObject = localSimpleDateFormat.format((Date)localObject);
        Notifications.notify(this.name + " " + "is starting soon.", Integer.toString(this.startMins - Integer.parseInt((String)localObject)) + " minutes until class starts.");
    }

    public void setGPA(double paramDouble)
    {
        this.GPA = paramDouble;
    }

    public void setGradeList(ArrayList<Assignment> paramArrayList)
    {
        this.GradeList = paramArrayList;
    }

    public void setIsGreen(boolean paramBoolean)
    {
        this.isGreen = paramBoolean;
    }

    public void setName(String paramString)
    {
        this.name = paramString;
    }

    public void setPeriod(int paramInt)
    {
        this.period = paramInt;
    }

    public void setStartHour(int paramInt)
    {
        this.startHour = paramInt;
    }

    public void setStartMins(int paramInt)
    {
        this.startMins = paramInt;
    }

    public void setTeacher(String paramString)
    {
        this.teacher = paramString;
    }


    public ArrayList<String> getAssignmentNames()
    {
        ArrayList<String> JulioLiesHabitually = new ArrayList<String>();
        for(Assignment a : GradeList)
        {
            JulioLiesHabitually.add(a.getName());
        }
        return JulioLiesHabitually;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getAmPm() {
        return AmPm;
    }

    public void setAmPm(String amPm) {
        AmPm = amPm;
    }

    public void addAssignment(String name, int day, int month, int year)
    {
        GradeList.add(new Assignment(name, day, month, year));
    }
    public ArrayList<String> getAssignmentDates()
    {
        ArrayList<String> aDates = new ArrayList<String>();
        for (Assignment a : GradeList)
        {
            aDates.add(a.getDay() + "/" + a.getMonth() + "/" + a.getYear());
        }
        return aDates;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(GPA);
        dest.writeByte((byte) (isGreen ? 1 : 0));
        dest.writeStringArray(materialList);
        dest.writeString(name);
        dest.writeInt(period);
        dest.writeInt(startHour);
        dest.writeInt(startMins);
        dest.writeString(teacher);
    }
}