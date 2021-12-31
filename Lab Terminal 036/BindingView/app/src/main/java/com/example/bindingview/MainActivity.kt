package com.example.bindingview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Toast
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import com.example.bindingview.databinding.MainActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = MainActivity.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        binding.btn1.setOnClickListener {
            Toast.makeText(this,"view binding",Toast.LENGTH_SHORT).show()
        }

    }
}