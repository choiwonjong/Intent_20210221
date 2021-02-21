package com.tjoeun.android.intent_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // 목적지 도착상황
        val receivedMessage = intent.getStringExtra("message")
        val birthDat        = intent.getStringExtra("출생년도")
        receivedMessageTxt.text = receivedMessage
    }
}