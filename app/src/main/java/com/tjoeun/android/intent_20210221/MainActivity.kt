package com.tjoeun.android.intent_20210221

import android.content.Intent
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

        sendContentBtn.setOnClickListener {
            //입력한문구 String으로 추출
            val inputContent = contentEdit.text.toString()

            // 두번째 화면
            val myIntent = Intent(this, SecondActivity::class.java)
            myIntent.putExtra("message", inputContent)
            myIntent.putExtra("출생년도", "1988")

            startActivity(myIntent)
        }
    }
}