package com.amitupadhyay.fireapp2;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by aupadhyay on 8/28/16.
 */

public class FireApp2 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
