package com.example.desafiotecnicoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafiotecnicoandroid.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}