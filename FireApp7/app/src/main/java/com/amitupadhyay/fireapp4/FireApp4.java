package com.amitupadhyay.fireapp4;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by aupadhyay on 8/28/16.
 */

public class FireApp4 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // For previous version
        //Firebase.setAndroidContext(this);

        // in latest versions

        if (!FirebaseApp.getApps(this).isEmpty())
        {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }
    }
}
