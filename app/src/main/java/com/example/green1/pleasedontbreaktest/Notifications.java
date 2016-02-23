package com.example.green1.pleasedontbreaktest;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.NotificationCompat.Builder;

public class Notifications extends Notification
{
    private String message;
    private String title;

    public Notifications(String paramString1, String paramString2)
    {
        this.title = paramString1;
        this.message = paramString2;
    }

    public static void notify(String paramString1, String paramString2)
    {
        MainActivity.setBuilder((android.support.v7.app.NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.aidsThis));
        MainActivity.getBuilder().setSmallIcon(2130837575);
        MainActivity.getBuilder().setContentTitle(paramString1);
        MainActivity.getBuilder().setContentText(paramString2);
        MainActivity.getNotificationManager().notify(3967, MainActivity.getBuilder().build());
    }

    public void createNotification()
    {
        MainActivity.setBuilder((android.support.v7.app.NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.aidsThis));
        MainActivity.getBuilder().setSmallIcon(2130837575);
        MainActivity.getBuilder().setContentTitle(this.title);
        MainActivity.getBuilder().setContentText(this.message);
        MainActivity.getNotificationManager().notify(3967, MainActivity.getBuilder().build());
    }
}