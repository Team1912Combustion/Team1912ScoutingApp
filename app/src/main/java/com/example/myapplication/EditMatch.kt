package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.com.example.myapplication.Match
import com.example.myapplication.databinding.EditMatchBinding


class EditMatch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.edit_match)
        val binding: EditMatchBinding = DataBindingUtil.setContentView(
            this, R.layout.edit_match)
        setContentView(binding.root)

        binding.match = Match(0,"null",0)


        binding.floatingActionButton2.setOnClickListener { view ->
            SaveMatch()
        }

    }

    fun SaveMatch(){


        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
