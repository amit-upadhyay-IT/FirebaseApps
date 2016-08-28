# This add uses a Application file where I'm writing Firebase.setAndroidContext(this);
(because then we need not to write it every time for every activity).

eg:

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

Also don't forget to include `android:name=".FireApp2"` in the application tag of manifest.xml file

In this app I've used concept of push() to create a child with a new key each time
