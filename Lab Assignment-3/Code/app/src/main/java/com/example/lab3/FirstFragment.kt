package com.example.lab3

import Singleton
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.lab3.databinding.FirstFragmentBinding


class FirstFragment : Fragment() {
    private var _binding: FirstFragmentBinding? = null
    private val binding get() = _binding!!
    private var nameList: MutableList<SampleModel> = mutableListOf()
    private lateinit var sampleAdapter: SampleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FirstFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fab: FloatingActionButton = view.findViewById(R.id.fab)
        nameList = Singleton.notesList()
        sampleAdapter = SampleAdapter(nameList)
        binding.apply {
            rvMain.apply {
                layoutManager= LinearLayoutManager(activity)
                adapter=sampleAdapter
            }
        }

        fab.setOnClickListener{
            val secondFragment = SecondFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, secondFragment)?.commit()
        }
    }
}

/* Code Reference:
[1] https://medium.com/@ezatpanah/recyclerview-in-android-with-example-in-depth-guide-94462a6b573b
[2] https://www.geeksforgeeks.org/how-to-use-view-binding-in-recyclerview-adapter-class-in-android/
*/




