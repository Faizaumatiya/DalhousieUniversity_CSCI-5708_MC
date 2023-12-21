package com.example.labassignment03.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.labassignment03.R
import com.example.labassignment03.databinding.FragmentFirstBinding
import com.example.labassignment03.persistence.NotesRecyclerViewAdapter
import com.example.labassignment03.persistence.NotesStorage

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addNoteButton.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        val recylerView : RecyclerView = view.findViewById(R.id.noteRV)
        recylerView.layoutManager = LinearLayoutManager(activity)

        val recyclerViewAdapter = NotesRecyclerViewAdapter()
        recylerView.adapter = recyclerViewAdapter

        recyclerViewAdapter.setNotes(NotesStorage.notes)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}