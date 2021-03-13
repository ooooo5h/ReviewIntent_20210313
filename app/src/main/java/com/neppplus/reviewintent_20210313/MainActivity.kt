package com.neppplus.reviewintent_20210313

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
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
//            화면 이동인건 동일 => Intent 기초 사용법은 그대로 적용

//            비행기 티켓팅
            val myIntent = Intent(this, MySecondActivity::class.java)

//            비행기 탑승승
            startActivty(myIntent)

        }
    }
}