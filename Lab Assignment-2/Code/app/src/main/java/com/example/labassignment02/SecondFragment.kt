package com.example.labassignment02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class SecondFragment : Fragment() {
    var output : String ?= " "
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val textView: TextView = view.findViewById(R.id.textView4)
        val btn: Button = view.findViewById(R.id.button3)
//        textView.setOnClickListener {
            output = arguments?.getString("message")
            if(output.equals("")){
                textView.text = "The secret was: no secret"
            }
            else{
                textView.text = "The secret was: " +output
            }
        btn.setOnClickListener {
            val firstFragment = FirstFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView,firstFragment)?.commit()
        }
        return view
    }
}
/*
Reference:
[1] https://www.youtube.com/watch?v=rpzuEN8UhUQ
[2] https://developer.android.com/guide/fragments/communicate
*/
