package com.amitupadhyay.fireapp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private TextView mValueView;

    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mValueView = (TextView) findViewById(R.id.valueView);

        mRef = new Firebase("https://fireapp3.firebaseio.com/");

    }
}
