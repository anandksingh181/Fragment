package com.example.fragment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment.databinding.ActivityMainBinding
import com.example.fragment.fragments.BlankFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var manager = supportFragmentManager // support of fm
        var tr = manager.beginTransaction()  // start tr
        tr.replace(R.id.frameLayout,BlankFragment()) // what tr
        tr.commit() // final done
    }
}