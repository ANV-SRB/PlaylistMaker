package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val asBtnBackId = findViewById<TextView>(R.id.asBtnBack)
        asBtnBackId.setOnClickListener{
            val activityMainOpenIntent = Intent(this, MainActivity::class.java)
            startActivity(activityMainOpenIntent)
        }
    }
}