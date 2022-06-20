package com.example.appwritetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import io.appwrite.Client
import io.appwrite.services.Account

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val client = Client(applicationContext)
            .setEndpoint("http://192.168.1.32/v1") // Your API Endpoint
            .setProject("62aafcfc8e85b6b7ff8f") // Your project ID
            .setSelfSigned(true) // Remove in production

        val account = Account(client)
        val response = account.create(
            "[USER_ID]",
            "email@example.com",
            "password"
        )
    }
}