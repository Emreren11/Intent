package com.emre.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emre.intent.databinding.ActivityMainBinding
import com.emre.intent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentFromMain = intent // Intent ile yönlendirme yapılırsa kullanılır
        val name = intentFromMain.getStringExtra("name") // Yönlendirme yapılan sayfadan anahtar kelime kullanarak veri çekme

        binding.nameText.text = "Welcome ${name}"
    }
}