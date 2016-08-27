package com.amitupadhyay.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private Button mSendData;

    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this); // right now we are woking with only one activity so we can add like this.

        mRef = new Firebase("https://fireapp-a700c.firebaseio.com/"); // now my database is connected to mRef variable,
        mSendData = (Button) findViewById(R.id.addString);

        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Firebase mRefChild = mRef.child("Name");

                mRefChild.setValue("Amit Upadhyay");
            }
        });

    }
}
