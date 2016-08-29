package com.amitupadhyay.fireapp6;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by aupadhyay on 8/29/16.
 */

public class FireApp6 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
