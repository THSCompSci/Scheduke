package com.example.green1.pleasedontbreaktest;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class Classes extends RealmObject {
    private double GPA;
    private RealmList<Assignment> GradeList = new RealmList<Assignment>();
    private boolean isGreen;
    private String name;
    private int period;
    private int startHour;
    private int startMins;
    private String teacher;
    private String AmPm;
    private RealmList<StringArrayWrapper> AssignmentDates;
    private RealmList<StringArrayWrapper> AssignmentNames;
    private int AddAssignment;


    public Classes()
    {
        GPA  = 0.0;
        isGreen = true;
        name = "FeCeS Inc";
        period = 1;
        startHour = 8;
        startMins = 0;
        teacher = "Mr. Felcher";
        AmPm = "AM";

    }
    public Classes(String paramString, int paramInt1, int paramInt2, int p, String Ap)
    {
        this.name = paramString;
        this.startHour = paramInt1;
        this.startMins = paramInt2;
        AmPm = Ap;
        period = p;
    }

    public Classes(String[] paramArrayOfString, String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2)
    {
        this.name = paramString1;
        this.period = paramInt1;
        this.startHour = paramInt2;
        this.startMins = paramInt3;
        this.teacher = paramString2;


    }

    protected Classes(Parcel in) {
        GPA = in.readDouble();
        isGreen = in.readByte() != 0;
        name = in.readString();
        period = in.readInt();
        startHour = in.readInt();
        startMins = in.readInt();
        teacher = in.readString();
    }




    public double getGPA()
    {
        return this.GPA;
    }

    public RealmList<Assignment> getGradeList()
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

   /* public void rewind(int paramInt)
    {
        Object localObject = Calendar.getInstance(TimeZone.getDefault()).getTime();
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("mm");
        localSimpleDateFormat.setTimeZone(TimeZone.getDefault());
        localObject = localSimpleDateFormat.format((Date)localObject);
        Notifications.notify(this.name + " " + "is starting soon.", Integer.toString(this.startMins - Integer.parseInt((String)localObject)) + " minutes until class starts.");
    }*/

    public void setAddAssignment(int addAssignment) {
        AddAssignment = addAssignment;
    }

    public void setGPA(double paramDouble)
    {
        this.GPA = paramDouble;
    }

    public void setGradeList(RealmList<Assignment> paramArrayList)
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


    public RealmList<StringArrayWrapper> getAssignmentNames()
    {
        RealmList<StringArrayWrapper> JulioLiesHabitually = new RealmList<StringArrayWrapper>();
        for(Assignment a : GradeList)
        {
            JulioLiesHabitually.add(new StringArrayWrapper(a.getName()));
        }
        return JulioLiesHabitually;
    }


    public String getAmPm() {
        return AmPm;
    }

    public void setAmPm(String amPm) {
        AmPm = amPm;
    }

    public void setAddAssignment(String name, int day, int month, int year)
    {
        GradeList.add(new Assignment(name, day, month, year));
    }
    public RealmList<StringArrayWrapper> getAssignmentDates()
    {
        RealmList<StringArrayWrapper> aDates = new RealmList<StringArrayWrapper>();
        for (Assignment a : GradeList)
        {
            aDates.add(new StringArrayWrapper(a.getDay() + "/" + a.getMonth() + "/" + a.getYear()));
        }
        return aDates;
    }

    public void setAssignmentDates(RealmList<StringArrayWrapper> assignmentDates) {
        AssignmentDates = assignmentDates;
    }

    public void setAssignmentNames(RealmList<StringArrayWrapper> assignmentNames) {
        AssignmentNames = assignmentNames;
    }

    public int getAddAssignment() {
        return AddAssignment;
    }

    /*
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
    }*/
}
