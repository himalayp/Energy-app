package com.example.himalay.energy;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Himalay on 28-03-2018.
 */

public class Database extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);


    }
}
