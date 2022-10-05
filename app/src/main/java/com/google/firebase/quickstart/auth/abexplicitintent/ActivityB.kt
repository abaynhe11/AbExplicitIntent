package com.google.firebase.quickstart.auth.abexplicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_b.*


class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val extras = intent.extras ?: return
        val qString = extras.getString("qString")
        //val textView1 : TextView = findViewById(R.id.textView1)
        textView1.text = qString

    }

   fun onClick(view: View) {
        finish()
    }
    override fun finish() {
        val data = Intent()
       // val editText1 : EditText = findViewById(R.id.editText1)
        val returnString = editText1.text.toString()
        data.putExtra("returnData", returnString)

        setResult(RESULT_OK, data)
        super.finish()
    }



}