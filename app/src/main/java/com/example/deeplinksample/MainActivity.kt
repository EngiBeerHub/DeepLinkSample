package com.example.deeplinksample

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intent?.data?.let { uri ->
            val parameterValue = uri.getQueryParameter("code")
            val state = uri.getQueryParameter("state")
            Log.d("MainActivity", parameterValue.toString())
            Log.d("MainActivity", state.toString())
            Toast.makeText(this, "code: $parameterValue", Toast.LENGTH_SHORT).show()
        }
    }
}