#Fetching data and displaying in ListView

Suppose that we have a json like :

    {
      "Users" : {
        "user_one" : "Amit",
        "user_three" : "Babu",
        "user_two" : "Girdhar"
      }
    }

We need to show this in ListView.

Previously we were using `addValueEventListener` but now to display in ListView we need to use `addChildEventListener` eg :

            mRef.addChildEventListener(new ChildEventListener() {

            // It will run then the app gets opened as well as it will also run when any data is added.
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String value = dataSnapshot.getValue(String.class);

                mUsername.add(value);

                arrayAdapter.notifyDataSetChanged();// this will notify the arrayAdapter that some new value is added and you need to display that value

            }

            // It will run only when the child is changed.
            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

There is still something that we need to change in this project. If someone changes some value in the db then no updation in the ListView take place at runtime because inside onChildChanged we haven't written anything.

There we need to write some code like : First we need to get the position where the data is chagned and then we need to put that chagned value into the ArrayList and then notify the adapter

With the help of Firebase UI this thing can be easily done.

#-Amit Upadhyay
