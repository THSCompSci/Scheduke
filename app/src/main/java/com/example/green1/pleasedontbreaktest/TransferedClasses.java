package com.example.green1.pleasedontbreaktest;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by 760974 on 4/8/2016.
 */
public class TransferedClasses extends RealmObject
{
   // private ArrayList<Classes> savedClasses;
    private RealmList<Classes> realmClasses;

    public TransferedClasses() {
    }

  /*  public TransferedClasses(ArrayList<Classes> savedClasses) {
        this.savedClasses = savedClasses;
    }*/

    public TransferedClasses(RealmList<Classes> realmClasses) {
        this.realmClasses = realmClasses;
    }
/*
    public ArrayList<Classes> getSavedClasses() {
        return savedClasses;
    }

    public void setSavedClasses(ArrayList<Classes> savedClasses) {
        this.savedClasses = savedClasses;
    }
*/
    public RealmList<Classes> getRealmClasses() {
        return realmClasses;
    }

    public void setRealmClasses(RealmList<Classes> realmClasses) {
        this.realmClasses = realmClasses;
    }
}
