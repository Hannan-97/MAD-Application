package com.example.login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
implementation 'com.android.volley:volley:1.2.1'

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnEmail = findViewById<Button>(R.id.btnEmail)

        btnEmail.setOnClickListener{
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("emailto:")
            putExtra(Intent.EXTRA_EMAIL, arrayOf("fa18-bse-036@cuiatk.edu.pk"))
            putExtra(Intent.EXTRA_SUBJECT, "Complaint")
        }
        if (intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
        }

        var btnImage = findViewById<Button>(R.id.btnImage)

        btnImage.setOnClickListener{
            val intent = Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA)
            if (intent.resolveActivity(packageManager) != null){
                val REQUEST_IMAGE_CAPTURE = 1
                startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
            }
        }





        }
    fun composeEmail(addresses: Array<String>, subject: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "*/*"
            putExtra(Intent.EXTRA_EMAIL, addresses)
            putExtra(Intent.EXTRA_SUBJECT, subject)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }

        fun viewContact() {
            val intent = Intent(Intent.ACTION_VIEW)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        private fun apicall() {
            val Uri="https://some-random-api.ml/animal/dog"
            val queue = Volley.newRequestQueue(this)
            val jsonObjectRequest = JsonObjectRequest(
                Request.Method.Get,url, null,
                Response.Listener{
                    Log.d("MainActivity", "Api call successful")

                },Response.ErrorListener
                {
                    Log.d("MainActivity", "Api call failed")
                }
            )
            queue.add(JsonObjectRequest)
        }

    }
    }