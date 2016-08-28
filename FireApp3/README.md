# Retriving data from server

# Steps :

1) Set the build.gradle requirements

2) Create the Application file where you will instantiate the Firebase (i.e. Firebase.setAndroidContext(this));

3) Do the changes in the Manifext file (i.e. add `android:name=".FireApp3"`, Internet permission)

4) Here I've change the rules for database to :
  
    {
      "rules": {
        ".read": true,
        ".write": true
      }
    }

5) Created Name as child of main reference from the database console
Ex :

    `mRef = new Firebase("https://fireapp3.firebaseio.com/Name"); // Here I've created my own child to the main Reference and then I'm using that Name as the main reference`

6) We will add a event listener on the mRef. In the database whenever any data is changed then the below code snipped is going to be executed.
Ex:

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


To fetch multiple data from server you can use Map data structure. EG:

                Map<String, String> map = dataSnapshot.getValue(Map.class);

                String name = map.get("Name");
                String age = map.get("Age");
                String profession = map.get("Profession");

                Log.v("TAG", "Name "+name);
                Log.v("TAG", "Age "+age);
                Log.v("TAG", "Profession "+profession);
And its done..!!
