package com.monikarangta.resume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistoryButton)
        workHistory.setOnClickListener {
            var moveToWorkHistory = Intent(applicationContext,WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var callMe = findViewById<Button>(R.id.callButton)
        callMe.setOnClickListener {
            var phoneUri= Uri.parse("tel: +358451686586")
            var makeCall = Intent(Intent.ACTION_DIAL,phoneUri)
            startActivity(makeCall)
        }

        var emailMe = findViewById<Button>(R.id.emailButton)
        emailMe.setOnClickListener {

            var sendEmail = Intent(Intent.ACTION_SEND)
            sendEmail.setType("plain/text")
            sendEmail.putExtra(Intent.EXTRA_EMAIL,"mrangta010@gmail.com")
            sendEmail.putExtra(Intent.EXTRA_SUBJECT,"Nice Resume")
            sendEmail.putExtra(Intent.EXTRA_TEXT,"I really enjoyed your resume...")
            startActivity(sendEmail)
        }

    }
}
