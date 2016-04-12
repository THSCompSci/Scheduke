package com.example.green1.pleasedontbreaktest;

import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;

public class Schedule extends RealmObject
{
    private String name = "Fecal Distributor";
    private RealmList<Classes> classList = new RealmList();
   // int counter = 0;
    //int position;
    private RealmList<Classes> AddToClassList;



    public RealmList<Classes> getAddToClassList() {
        return AddToClassList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassList(RealmList<Classes> classList) {
        this.classList = classList;
    }

    public Schedule()

    {
        classList.add(new Classes("Example Class Name", 8, 0 , 1 , "AM"));
    }
    public Schedule(RealmList<Classes> blah)
    {
        for (int i = 0; i < blah.size(); i++)
        {
            classList.add((Classes) blah.get(i));
        }
    }
    /*public void addClass(String paramString, int paramInt1, int paramInt2,int p, String ampm)
    {
        this.counter = 0;
        Class c = new Class(paramString, paramInt1, paramInt2,p, ampm);
        Schedule.this.classList.add(Schedule.this.position, c);
    }


    public int getSize(){ return classList.size(); }
*/

    public void setAddToClassList(RealmList<Classes> addToClassList) {
        AddToClassList = addToClassList;
    }

    public RealmList<Classes> getClassList()
    {
        return classList;
    }

 /*   public void organizeClassList()
    {
        ArrayList localArrayList = new ArrayList();
        int i = 1;
        while (i < this.classList.size() + 1)
        {
            Iterator localIterator = this.classList.iterator();
            while (localIterator.hasNext())
            {
                Class localClass = (Class)localIterator.next();
                if (localClass.getPeriod() == i)
                    localArrayList.add(localClass);
            }
            i += 1;
        }
        this.classList = localArrayList;
    }
*/

  /*  public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }*/
}