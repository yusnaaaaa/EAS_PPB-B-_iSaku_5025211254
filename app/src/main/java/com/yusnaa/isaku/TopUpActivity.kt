package com.yusnaa.isaku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusnaa.isaku.databinding.ActivityTopUpBinding

class TopUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTopUpBinding
    private lateinit var topUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        topUpButton = binding.continurButton
        topUpButton.setOnClickListener {
            val intent = Intent(this, ResultTransferActivity::class.java)
            startActivity(intent)
        }
    }
}