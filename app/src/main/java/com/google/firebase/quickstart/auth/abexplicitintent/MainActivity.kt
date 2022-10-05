package com.google.firebase.quickstart.auth.abexplicitintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
import kotlinx.android.synthetic.main.activity_b.*
import org.w3c.dom.Text
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private val request_code = 101

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }

    fun onClick(view: View) {

        val i = Intent(this, ActivityB::class.java)
        val myString = editText.text.toString()
        i.putExtra("qString", myString)
        startActivityForResult(i,request_code)
    }



            @SuppressLint("MissingSuperCall")
            override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
                if ((requestCode == request_code) &&
                    (resultCode == RESULT_OK)
                ) {

                    if (data!!.hasExtra("returnData")) {
                        val returnString = data.extras!!.getString("returnData")
                        //val textView1: TextView = findViewById(R.id.textView)
                        textView.text = returnString
                    }
                }
            }
        }

