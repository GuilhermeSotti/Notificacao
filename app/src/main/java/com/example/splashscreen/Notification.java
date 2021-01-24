package com.example.splashscreen;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Notification extends AppCompatActivity {

    public static final String CHANNEL_1_ID = "chanel_1";
    public static final String CHANNEL_2_ID = "chanel_2";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createNotificationChanel();
    }

    private void createNotificationChanel() {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            NotificationChannel chanel1 = new NotificationChannel(
                    CHANNEL_1_ID, "Channel_1",
                    NotificationManager.IMPORTANCE_HIGH
            );
            chanel1.setDescription("This is Chanel 1");

            NotificationChannel chanel2 = new NotificationChannel(
                    CHANNEL_2_ID, "Channel_2",
                    NotificationManager.IMPORTANCE_LOW
            );
            chanel2.setDescription("This is Chanel 2");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(chanel1);
            manager.createNotificationChannel(chanel2);
        }
    }
}