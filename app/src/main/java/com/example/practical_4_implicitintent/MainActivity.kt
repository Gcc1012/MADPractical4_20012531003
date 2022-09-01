package com.example.practical_4_implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import java.net.URI
import java.net.URL

class MainActivity : AppCompatActivity() {
    lateinit var edit_ref :EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit_ref = findViewById(R.id.edittext_id)
    }

    fun OpenLocation(view: View) {
        val message_link = edit_ref.text.toString()
        val webpage : Uri = Uri.parse(message_link)
        val intent = Intent(Intent.ACTION_VIEW,webpage)
        if (intent.resolveActivity(packageManager)!=null){
            startActivity(intent)

        }
        else{
            Log.d("Implicit intent","Cannot Handle intent" )
        }

    }
}