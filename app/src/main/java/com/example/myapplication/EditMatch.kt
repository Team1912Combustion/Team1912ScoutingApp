package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.EditMatchBinding
import com.google.android.material.snackbar.Snackbar
import java.util.logging.Logger


class EditMatch : AppCompatActivity() , AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.edit_match)
        val binding: EditMatchBinding = DataBindingUtil.setContentView(
            this, R.layout.edit_match)
        setContentView(binding.root)

        binding.match = Match(0,"null",0)

        //  Declare all spinners
        var score_choices = arrayOf("None","Block","Cone")
        val spinner_1tl: Spinner = findViewById(R.id.spinner_1tl)
        val spinner_1tm: Spinner = findViewById(R.id.spinner_1tm)
        val spinner_1tr: Spinner = findViewById(R.id.spinner_1tr)

        val spinner_1ml: Spinner = findViewById(R.id.spinner_1ml)
        val spinner_1mm: Spinner = findViewById(R.id.spinner_1mm)
        val spinner_1mr: Spinner = findViewById(R.id.spinner_1mr)

        val spinner_1bl: Spinner = findViewById(R.id.spinner_1bl)
        val spinner_1bm: Spinner = findViewById(R.id.spinner_1bm)
        val spinner_1br: Spinner = findViewById(R.id.spinner_1br)


        var aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, score_choices)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_1tl.adapter = aa
        spinner_1tm.adapter = aa
        spinner_1tr.adapter = aa

        spinner_1ml.adapter = aa
        spinner_1mm.adapter = aa
        spinner_1mr.adapter = aa

        spinner_1bl.adapter = aa
        spinner_1bm.adapter = aa
        spinner_1br.adapter = aa

        binding.floatingActionButton2.setOnClickListener { view ->
            SaveMatch()
        }


    }


    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)

        val snack = Snackbar.make(view!!,"This is a simple Snackbar",10)
        snack.show()

        view?.setBackgroundColor(Color.WHITE)
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }


    fun SaveMatch(){


        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
