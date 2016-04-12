package com.example.green1.pleasedontbreaktest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import io.realm.RealmList;

/**
 * Created by julio on 9/22/15.
 */
public class CustomArrayAdapter extends BaseAdapter implements ListAdapter {
    private ArrayList<String> list = new ArrayList<String>();
    private ArrayList<String> listSub = new ArrayList<String>();
    private Context context;



    public CustomArrayAdapter(ArrayList<String> list,ArrayList<String> listSub, Context context) {
        for(int index = 0; index < list.size(); index++) {
            this.list.add(list.get(index));
        }
        for(int i = 0; i < list.size(); i++) {
            this.listSub.add(listSub.get(i));
        }
        this.context = context;
    }


    public CustomArrayAdapter(RealmList<StringArrayWrapper> list, RealmList<StringArrayWrapper> listSub, Context context) {
        for (int index = 0; index < list.size(); index++) {
            this.list.add(list.get(index).getStupid());
        }
        for (int i = 0; i < list.size(); i++) {
            this.listSub.add(listSub.get(i).getStupid());
        }


        this.context = context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return 0;
        //just return 0 if your list items do not have an Id variable.
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_custom_item, null);
        }

        //Handle TextView and display string from your list
        TextView listItemText = (TextView)view.findViewById(R.id.assignment_text);
        listItemText.setText(list.get(position));


        TextView listItemText2 = (TextView)view.findViewById(R.id.class_text);
        listItemText2.setText(listSub.get(position));


        return view;
    }
}
