package com.example.labassignment02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fisrt, container, false);
        //return inflater.inflate(R.layout.fragment_fisrt, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nextButton = view.findViewById<Button>(R.id.button_first)
        val passwordText = view.findViewById<EditText>(R.id.editTextTextPassword)

        nextButton.setOnClickListener{
            val bundle = bundleOf("password" to passwordText.text.toString())
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle);
        }


    }
}