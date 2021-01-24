package com.example.splashscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;


public class MainActivity extends AppCompatActivity{
    private NotificationManagerCompat Compat;
    private EditText editTextTitle;
    private EditText editTextMessage;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Compat = NotificationManagerCompat.from(this);
        editTextTitle = findViewById(R.id.Edit_Text_Tilte);
        editTextMessage = findViewById(R.id.Edit_Text_Message);

    }

    public void sendonChannel1(View view) {

        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        android.app.Notification notification = new NotificationCompat.Builder(this, Notification.CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        Compat.notify(1,notification);
    }

    public void sendonChannel2(View view) {

        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        android.app.Notification notification = new NotificationCompat.Builder(this, Notification.CHANNEL_2_ID)
                .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .build();
        Compat.notify(2,notification);
    }
}