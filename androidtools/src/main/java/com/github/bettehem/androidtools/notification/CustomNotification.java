package com.github.bettehem.androidtools.notification;

/*
    Copyright 2015  Chris Mustola
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see http://www.gnu.org/licenses/.
 */

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

public class CustomNotification {
    NotificationCompat.Builder builder;
    Context context;


    private CustomNotification(Context context, NotificationCompat.Builder builder){
        this.context = context;
        this.builder = builder;
    }

    public static CustomNotification make(Context context, int iconId, String title, String message, Intent intent, boolean isPersistent, boolean dismissOnTap){
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context);
        notificationBuilder.setSmallIcon(iconId);
        notificationBuilder.setContentTitle(title);
        notificationBuilder.setContentText(message);
        notificationBuilder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));
        notificationBuilder.build();

        PendingIntent resultPendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notificationBuilder.setContentIntent(resultPendingIntent);

        notificationBuilder.setOngoing(isPersistent);
        notificationBuilder.setAutoCancel(dismissOnTap);

        return new CustomNotification(context, notificationBuilder);
    }

    public void show(){
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(10000, builder.build());
    }
}
