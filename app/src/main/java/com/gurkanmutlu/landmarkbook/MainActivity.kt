package com.gurkanmutlu.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gurkanmutlu.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark> // Create an ArrayList of Landmark objects

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        landmarkList = ArrayList<Landmark>() // Initialize the ArrayList
    }
}