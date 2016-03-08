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
    private RealmList<Class> classList = new RealmList();
   // int counter = 0;
    //int position;


    public Schedule()
    {
        classList.add(new Class("Example Class Name", 8, 0 , 1 , "AM"));
    }
    public Schedule(ArrayList<RealmObject> blah)
    {
        for (int i = 0; i < blah.size(); i++)
        {
            classList.add((Class) blah.get(i));
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
    public RealmList<Class> getClassList()
    {
        return this.classList;
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
    public void addToClassList(Class JingleBells)
    {
        classList.add(JingleBells);
    }

  /*  public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }*/
}