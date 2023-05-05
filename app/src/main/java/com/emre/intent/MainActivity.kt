package com.emre.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.emre.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun next(view: View) {
        val intent = Intent(this@MainActivity, SecondActivity::class.java) //Yönlendirme, galeri açma vb işlemler için kullanılır
        // :: -> referans verir
        intent.putExtra("name", binding.editText.text.toString()) // age anahtar kelimesi ile veri gönderilir
        startActivity(intent)
        //finish() -> yönlendirme yaparken sayfayı kapatır (onDestroy)
    }
}