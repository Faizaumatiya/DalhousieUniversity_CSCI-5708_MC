package com.example.labassignment02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FirstFragment : Fragment() {
    private lateinit var transferData: PassData
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val btn: Button = view.findViewById(R.id.button2)
        val editText: EditText = view.findViewById(R.id.editTextTextPassword2)
        transferData = activity as PassData

        btn.setOnClickListener {
            transferData.passData(editText.text.toString())
        }
        return view
    }
}