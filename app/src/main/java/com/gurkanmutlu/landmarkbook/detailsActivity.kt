package com.gurkanmutlu.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gurkanmutlu.landmarkbook.databinding.ActivityDetailsBinding

class detailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        val intent = intent

        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark // hangi landmarkı gönderdiğimizi belirtiyoruz


        binding.nameText.text = selectedLandmark.name
        binding.countryName.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)

    }
}