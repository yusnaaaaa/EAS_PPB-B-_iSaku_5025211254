package com.yusnaa.isaku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusnaa.isaku.databinding.ActivityResultTransferBinding

class ResultTransferActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultTransferBinding
    private lateinit var continueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultTransferBinding.inflate(layoutInflater)
        setContentView(binding.root)

        continueButton = binding.registerButton
        continueButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}