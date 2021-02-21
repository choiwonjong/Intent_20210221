package com.tjoeun.android.intent_20210221

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_change_nick_name.*

class ChangeNickName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_nick_name)

        okBtn.setOnClickListener {

            val inputNickName = "입력닉네임:코지"

            // 확인버튼을 누른게 맞다명시 + 그때 들고가갈 데이터를  첨부
            // 데이터 첨부전용 Intent todtjd
            // 복귀용이무로 출발/도착지 정보 필요 없다  빈칸유지
             val retIntent = Intent()
            retIntent.putExtra("nick", inputNickName)

            setResult(Activity.RESULT_OK, retIntent)

            finish()

        }
    }
}