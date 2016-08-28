package com.amitupadhyay.fireapp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private TextView mValueView;

    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mValueView = (TextView) findViewById(R.id.valueView);

        mRef = new Firebase("https://fireapp3.firebaseio.com/Name"); // Here I've created my own child to the main Reference and then I'm using that Name as the main reference

        // In the database whenever any data is changed then the below code snipped is going to be executed.
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                // the changed value is going to be stored into the dataSnapshot

                // to retrive value from dataSnapshot we write

                String value = dataSnapshot.getValue(String.class);
                mValueView.setText(value);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

                mValueView.setText(firebaseError.toString());

            }
        });

    }
}
