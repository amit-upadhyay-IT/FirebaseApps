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

                // This code snipet will only if we have a three objects below the Name.
                // i.e. to display multiple views we can use the concept given below
                /*Map<String, String> map = dataSnapshot.getValue(Map.class);

                String name = map.get("Name");
                String age = map.get("Age");
                String profession = map.get("Profession");

                Log.v("TAG", "Name "+name);
                Log.v("TAG", "Age "+age);
                Log.v("TAG", "Profession "+profession);
*/
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

                mValueView.setText(firebaseError.toString());

            }
        });

    }
}
