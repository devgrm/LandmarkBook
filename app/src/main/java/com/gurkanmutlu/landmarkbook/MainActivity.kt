package com.gurkanmutlu.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.gurkanmutlu.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark> // Create an ArrayList of Landmark objects

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        


        landmarkList = ArrayList<Landmark>() // Initialize the ArrayList

        val sofia = Landmark("Bulgaria","Bulgaria", R.drawable.sofia)
        val london = Landmark("London","İngiltere" ,R.drawable.london)
        val collesseum = Landmark("Rome","İtalya", R.drawable.italya)
        val eiffel = Landmark("Paris", "France",R.drawable.paris)


        landmarkList.add(sofia)
        landmarkList.add(london)
        landmarkList.add(collesseum)
        landmarkList.add(eiffel)



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = landmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter


    }
}