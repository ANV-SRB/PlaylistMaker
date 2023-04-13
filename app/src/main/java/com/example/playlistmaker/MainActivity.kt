package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //доступ к элементам на activity_main   public <T extends View> T findViewById(@IdRes int id)
        val amBtnSearchId = findViewById<Button>(R.id.amBtnFind)
        val amBtnMediaId = findViewById<Button>(R.id.amBtnMedia)
        val amBtnSettingsId = findViewById<Button>(R.id.amBtnSettings)

        //val toastAmBtnFindId = Toast.makeText(this@MainActivity, "Нажали на Поиск!", Toast.LENGTH_SHORT)
       // val toastAmBtnMediaId = Toast.makeText(this@MainActivity, "Нажали на Медиатека!", Toast.LENGTH_LONG)
        //val toastAmBtnSettingsId = Toast.makeText(this@MainActivity, "Нажали на Настройки!", Toast.LENGTH_SHORT)


        amBtnSearchId.setOnClickListener {
            val activitySearchIntentOpen = Intent(this, SearchActivity::class.java)
            startActivity(activitySearchIntentOpen)
        }


        amBtnSettingsId.setOnClickListener {
            val activitySettingIntentOpen = Intent(this, SettingsActivity::class.java)
            startActivity(activitySettingIntentOpen)
        }

        amBtnMediaId.setOnClickListener {
            val activityMediaIntentOpen = Intent(this, MediaActivity::class.java)
            startActivity(activityMediaIntentOpen)
        }
    }
}