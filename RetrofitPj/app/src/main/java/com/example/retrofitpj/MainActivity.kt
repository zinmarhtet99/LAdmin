package com.example.retrofitpj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edt_name=findViewById<EditText>(R.id.edt)
        var btn_add=findViewById<Button>(R.id.btn_add)

        btn_add.setOnClickListener {
            var txt=edt_name.text

            var intent= Intent(this,SecondActivity::class.java)

            intent.putExtra("name",txt)
            intent.putExtra("Id",txt)
            startActivity(intent)

        }

    }
}
