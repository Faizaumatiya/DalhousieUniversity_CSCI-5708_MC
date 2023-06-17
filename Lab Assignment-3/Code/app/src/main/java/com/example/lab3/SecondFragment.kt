package com.example.lab3

import Singleton
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class SecondFragment : Fragment() {
    private var nameList: MutableList<SampleModel> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.second_fragment, container, false)
        val editTextTitle: EditText = view.findViewById(R.id.notes_title)
        val editTextBody: EditText = view.findViewById(R.id.notes_body)
        val saveButton: Button = view.findViewById(R.id.save_button)
        saveButton.setOnClickListener {

            val inputTitle = editTextTitle.text.toString()
            val inputBody = editTextBody.text.toString()
            val firstFragment = FirstFragment()
            val transaction = fragmentManager?.beginTransaction()
            if((inputTitle == "" || inputBody == "" )){
                transaction?.replace(R.id.fragmentContainerView, firstFragment)?.commit()
            }
            else{
                nameList.add(SampleModel(inputTitle, inputBody))
                Singleton.insertData(nameList)
                transaction?.replace(R.id.fragmentContainerView, firstFragment)?.commit()
            }

        }
        return view
    }
}
/*
 Code Reference:
[1] https://www.youtube.com/watch?v=rpzuEN8UhUQ
[2] https://developer.android.com/guide/fragments/communicate
[3] https://medium.com/@ezatpanah/recyclerview-in-android-with-example-in-depth-guide-94462a6b573b
*/
