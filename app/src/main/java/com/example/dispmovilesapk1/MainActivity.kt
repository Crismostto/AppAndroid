package com.example.dispmovilesapk1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.EditText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
         }
        startActivity(intent);
    }

    fun verFragmentRojo(view: View) {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, FragmentRed()).commit()
    }

    fun verFragmentVerde(view: View) {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, FragmentGreen()).commit()
    }


}