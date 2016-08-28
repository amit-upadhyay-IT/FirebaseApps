# Sends data to server

#Important points :

#1) After setting up firebase include these dependencies :

    compile 'com.google.firebase:firebase-core:9.2.0'
    compile 'com.firebase:firebase-client-android:2.5.2'
    
(you need to include these dependencies only when you are not getting 'cloud' option in your ProjectStructure).
    
Also give the permission to internet

#2) You can simply use this :


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
