package com.example.preodabitcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnPreco)
        btn.setOnClickListener(){

            val httpBitcoin = HttpBitcoin()

            httpBitcoin.run()

        }

    }
}