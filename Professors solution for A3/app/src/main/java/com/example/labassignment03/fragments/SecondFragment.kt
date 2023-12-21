package com.example.labassignment03.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.labassignment03.R
import com.example.labassignment03.databinding.FragmentSecondBinding
import com.example.labassignment03.model.Note
import com.example.labassignment03.persistence.NotesStorage

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.saveNoteButton.setOnClickListener {
            val title = view.findViewById<EditText>(R.id.noteAddTitle).text
            val body = view.findViewById<EditText>(R.id.noteAddBody).text

            if(title.isNotEmpty() && body.isNotEmpty() ){
                NotesStorage.notes.add(Note(title.toString(),body.toString()))
            }


            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}