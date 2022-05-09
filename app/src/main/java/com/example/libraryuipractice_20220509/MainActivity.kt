package com.example.libraryuipractice_20220509

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setupValues()
    }

    fun setupEvents(){
        profileImg.setOnClickListener {
            val myIntent = Intent(this, ProfileActivity::class.java)
            startActivity(myIntent)
        }
    }

    fun setupValues(){

    }
}