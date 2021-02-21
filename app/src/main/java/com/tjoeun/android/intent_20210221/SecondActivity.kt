package com.tjoeun.android.intent_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // 목적지 도착상황
        // 참조형변수는 기본값지정안함
        // 첨부안되면 null
        val receivedMessage = intent.getStringExtra("message")

        // Int, Double, Boolean -> Default value지정
        val myBirthYear= intent.getIntExtra("출생년도", 0)

        receivedMessageTxt.text = receivedMessage
    }
}