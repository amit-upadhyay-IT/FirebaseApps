package com.amitupadhyay.fireapp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private Button addBtn;
    private EditText value;

    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootRef = new Firebase("https://fireapp2-51dea.firebaseio.com/");

        addBtn = (Button) findViewById(R.id.addBtn);
        value = (EditText) findViewById(R.id.value);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String val = value.getText().toString().trim();

                Firebase childRootRef = mRootRef.child("Name");

                childRootRef.setValue(val);

                mRootRef.push().setValue(val);// this add a new value each time with a different key(random key generated)
            }
        });

    }
}
