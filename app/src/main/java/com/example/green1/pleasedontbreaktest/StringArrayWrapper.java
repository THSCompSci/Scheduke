package com.example.green1.pleasedontbreaktest;

import java.util.ArrayList;

import io.realm.RealmObject;

/**
 * Created by 760974 on 3/10/2016.
 */
public class StringArrayWrapper extends RealmObject
{
    private String Stupid;

    public StringArrayWrapper()
    {

    }
    public StringArrayWrapper(String s)
    {
        Stupid = s;
    }

    public String getStupid() {
        return Stupid;
    }

    public void setStupid(String stupid) {
        Stupid = stupid;
    }
}
