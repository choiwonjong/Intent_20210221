package com.tjoeun.android.intent_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstActivity.setOnClickListener {
            var myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)
        }

    }
}