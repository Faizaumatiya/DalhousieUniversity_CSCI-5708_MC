package com.example.labassignment02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    private var secret = "no secret";

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        secret = arguments?.getString("password")!!
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textField = view.findViewById<TextView>(R.id.textview_second);
        textField.text =  "${textField.text} $secret"

        val button = view.findViewById<Button>(R.id.button_second)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }

    }

}