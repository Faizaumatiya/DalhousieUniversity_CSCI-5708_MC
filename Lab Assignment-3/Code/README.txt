==============================================================================================================================
Mobile Computing Assignment 03
Name: Faiza Aziz Umatiya
Banner: B00899642

==============================================================================================================================
Steps I followed:

1. I created 2 fragments namely FirstFragment.kt and SecondFragment.kt
2. FristFragment.kt - contains the Floating action button which directs us to the seconragment using onClickListerner.
3. SecondFragment.kt - users inserts the notes title and notes body and clicks on save button. The data is stored in the Singleton.kt class.
4. The notes data is stored in an ArrayList in Singleton which then can be fetched by the FirstFragment.
5. Now the FirstFragment can read the saved notes.
6. I added a condition in SecondFragment to not save the note if the title is empty or body is empty or both are empty.
7. Lastly, the MainActivity will display the FirstFragment when the user opens the app.


==============================================================================================================================
References:

[1] https://www.youtube.com/watch?v=cvu57vVcA2M 
[2] https://www.youtube.com/watch?v=or_pH92l-IQ&list=RDCMUCWwkUVHo7ryXLWGuwXY_uDA&index=3 
[3] https://medium.com/@ezatpanah/recyclerview-in-android-with-example-in-depth-guide-94462a6b573b 
[4] https://stackoverflow.com/questions/49007322/how-to-use-singleton-class-to-pass-list-data-from-one-fragment-to-another
[5] https://www.geeksforgeeks.org/how-to-use-view-binding-in-recyclerview-adapter-class-in-android/ 
[6] https://stackoverflow.com/questions/55979644/am-i-having-kotlin-functions-return-a-list-correctly 
[7] https://www.youtube.com/watch?v=rpzuEN8UhUQ
[8] https://developer.android.com/guide/fragments/communicate
