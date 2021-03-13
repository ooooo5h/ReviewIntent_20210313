package com.neppplus.reviewintent_20210313

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstBtn.setOnClickListener {

//            출발지/목적지 정보 : 비행기 티켓 발권
            val myIntent = Intent( this, MyFirstActivity::class.java)

//           티켓 들고 비행기 탑승
            startActivity(myIntent)

        }

        moveToSecondBtn.setOnClickListener {

//            어떤 내용이 적혔는지 확인?
            val inputMessage = messageEdt.text.toString()

//            화면 이동인건 동일 => Intent 기초 사용법은 그대로 적용

//            비행기 티켓팅
            val myIntent = Intent(this, MySecondActivity::class.java)

//            티켓에 데이터를 추가로 기록, 수하물이 뭔지
            myIntent.putExtra("message", inputMessage)

//            비행기 탑승
//            startActivty(myIntent)
        }

        editNickBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameMainActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }

    }
}