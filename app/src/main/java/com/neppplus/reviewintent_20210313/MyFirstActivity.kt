package com.neppplus.reviewintent_20210313

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_first.*

class MyFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_first)

        backToMainBtn.setOnClickListener {
//            복귀용 화면 종류 코드
            finish()
            
        }



        }
    }
}