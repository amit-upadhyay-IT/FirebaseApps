# Retriving data from server

# Steps :

1) Set the build.gradle requirements

2) Create the Application file where you will instantiate the Firebase (i.e. Firebase.setAndroidContext(this));

3) Do the changes in the Manifext file (i.e. add `android:name=".FireApp3"`, Internet permission)

4) Here I've change the rules for database to :
  
    `{
      "rules": {
        ".read": true,
        ".write": true
      }
    }`

5) Created Name as child of main reference from the database console
Ex :
  `mRef = new Firebase("https://fireapp3.firebaseio.com/Name"); // Here I've created my own child to the main Reference and then I'm using that Name as the main reference`

6)
