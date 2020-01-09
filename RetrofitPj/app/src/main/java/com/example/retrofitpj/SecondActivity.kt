package com.example.retrofitpj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var txt=findViewById<TextView>(R.id.txt_name)

        var intent=intent
        var name=intent.getStringExtra("name")
        var id=intent.getIntExtra("Id",0)
        txt.text=id.toString()
        txt.text=name




    }
}
