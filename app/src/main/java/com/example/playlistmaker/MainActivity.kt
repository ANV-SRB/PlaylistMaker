package com.example.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //доступ к элементам на activity_main
        //public <T extends View> T findViewById(@IdRes int id)

        val amBtnFindId = findViewById<Button>(R.id.amBtnFind)
        val amBtnMediaId = findViewById<Button>(R.id.amBtnMedia)
        val amBtnSettingsId = findViewById<Button>(R.id.amBtnSettings)

        val toastAmBtnFindId = Toast.makeText(this@MainActivity, "Нажали на amBtnFind!", Toast.LENGTH_SHORT)
        val toastAmBtnMediaId = Toast.makeText(this@MainActivity, "Нажали на amBtnMedia!", Toast.LENGTH_LONG)

        amBtnFindId.setOnClickListener {
            toastAmBtnFindId.show()
        }

        val amBtnFindIdListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                toastAmBtnFindId.show()
            }
        }
        amBtnFindId.setOnClickListener(amBtnFindIdListener)

    }
}