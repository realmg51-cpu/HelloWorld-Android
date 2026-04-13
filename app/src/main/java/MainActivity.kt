package com.cotlin.helloandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cotlin.helloandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.messageText.text = "Hi! App runs successfully!"
    }
}
