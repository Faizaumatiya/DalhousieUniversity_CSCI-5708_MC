package com.example.labassignment02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), PassData {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, firstFragment).commit()
    }

    override fun passData(editTextData: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextData)
        val transaction = this.supportFragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle
        transaction.replace(R.id.fragmentContainerView, secondFragment).commit()
    }
}