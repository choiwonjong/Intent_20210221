package com.tjoeun.android.intent_20210221

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // 닉네임변경 - 1001 이라는것을 아에 변수로넣어두고 ㅏ상요
    val REQ_FOR_NICKNAME = 1001

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

            // 두번째 화면으로 전달
            val myIntent = Intent(this, SecondActivity::class.java)

            myIntent.putExtra("message", inputContent)
            myIntent.putExtra("출생년도", 1988)

            startActivity(myIntent)
        }

        changeNickName.setOnClickListener {

            // 새 닉네임을 얻기 위해 => 액티비티 이동
            val myIntent = Intent(this, ChangeNickName::class.java)

            // 어떤 데이터를 받으로 가는건지 숫자로 구별
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

            startActivity(myIntent)
        }

        dialBtn.setOnClickListener {

            //입력한 전화번호
            val phoneNumber = "01011112222"

            // 폰번호 => 안드로이드의 연결정보(Uri)로 변환
            val myUri = Uri.parse("tel:${phoneNumber}")

            //Intent를 활용 -> 안드로이드 전화 화면 띠으기
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)



        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // requestCode 값확인 => 닉네임 가지러 갔다 온게 맞는가?
        if (requestCode == REQ_FOR_NICKNAME) {

            // 확인 버튼을 누른게 맞으면
            if (resultCode == Activity.RESULT_OK) {
                // 새 닉네임
                val newNicName = data?.getStringExtra("nick")

            //  nickNameTxt.text = newNicName;
            }
        }


    }
}