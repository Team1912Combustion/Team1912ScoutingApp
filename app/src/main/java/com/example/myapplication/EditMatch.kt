package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.EditMatchBinding


class EditMatch : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.edit_match)
        val binding: EditMatchBinding = DataBindingUtil.setContentView(
            this, R.layout.edit_match)
        setContentView(binding.root)
        binding.match = Match(0,"Foo",1, true)
        val testValue: Int = 0

        val mobilityCheck: CheckBox = findViewById(R.id.mobilityCheck)
        mobilityCheck.isChecked = true
        //  Declare Auto Team Spinners
        val score_choices = arrayOf("None","Block","Cone")
        val spinner_1tl: Spinner = findViewById(R.id.spinner_1tl)
        val spinner_1tm: Spinner = findViewById(R.id.spinner_1tm)
        val spinner_1tr: Spinner = findViewById(R.id.spinner_1tr)

        val spinner_1ml: Spinner = findViewById(R.id.spinner_1ml)
        val spinner_1mm: Spinner = findViewById(R.id.spinner_1mm)
        val spinner_1mr: Spinner = findViewById(R.id.spinner_1mr)

        val spinner_1bl: Spinner = findViewById(R.id.spinner_1bl)
        val spinner_1bm: Spinner = findViewById(R.id.spinner_1bm)
        val spinner_1br: Spinner = findViewById(R.id.spinner_1br)

        // Declare Auto Community Spinners
        val spinner_ac_1tl: Spinner = findViewById(R.id.spinner_ac_1tl)
        val spinner_ac_1tm: Spinner = findViewById(R.id.spinner_ac_1tm)
        val spinner_ac_1tr: Spinner = findViewById(R.id.spinner_ac_1tr)

        val spinner_ac_1ml: Spinner = findViewById(R.id.spinner_ac_1ml)
        val spinner_ac_1mm: Spinner = findViewById(R.id.spinner_ac_1mm)
        val spinner_ac_1mr: Spinner = findViewById(R.id.spinner_ac_1mr)

        val spinner_ac_1bl: Spinner = findViewById(R.id.spinner_ac_1bl)
        val spinner_ac_1bm: Spinner = findViewById(R.id.spinner_ac_1bm)
        val spinner_ac_1br: Spinner = findViewById(R.id.spinner_ac_1br)

        //
        val spinner_to_1tl: Spinner = findViewById(R.id.spinner_to_1tl)
        val spinner_to_1tm: Spinner = findViewById(R.id.spinner_to_1tm)
        val spinner_to_1tr: Spinner = findViewById(R.id.spinner_to_1tr)

        val spinner_to_1ml: Spinner = findViewById(R.id.spinner_to_1ml)
        val spinner_to_1mm: Spinner = findViewById(R.id.spinner_to_1mm)
        val spinner_to_1mr: Spinner = findViewById(R.id.spinner_to_1mr)

        val spinner_to_1bl: Spinner = findViewById(R.id.spinner_to_1bl)
        val spinner_to_1bm: Spinner = findViewById(R.id.spinner_to_1bm)
        val spinner_to_1br: Spinner = findViewById(R.id.spinner_to_1br)

        //
        val spinner_2tl: Spinner = findViewById(R.id.spinner_2tl)
        val spinner_2tm: Spinner = findViewById(R.id.spinner_2tm)
        val spinner_2tr: Spinner = findViewById(R.id.spinner_2tr)

        val spinner_2ml: Spinner = findViewById(R.id.spinner_2ml)
        val spinner_2mm: Spinner = findViewById(R.id.spinner_2mm)
        val spinner_2mr: Spinner = findViewById(R.id.spinner_2mr)

        val spinner_2bl: Spinner = findViewById(R.id.spinner_2bl)
        val spinner_2bm: Spinner = findViewById(R.id.spinner_2bm)
        val spinner_2br: Spinner = findViewById(R.id.spinner_2br)

        var charge_states = arrayOf("None","Engaged","Unengaged")
        val auto_chargeS1: Spinner = findViewById(R.id.auto_chargeS1)
        val auto_chargeS2: Spinner = findViewById(R.id.auto_chargeS2)

        var element_array = ArrayAdapter(this, android.R.layout.simple_spinner_item, score_choices)
        element_array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        var charge_adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, charge_states)
        element_array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Assign array adapter for auto team grid
        spinner_1tl.adapter = element_array
        spinner_1tl?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

        }

        spinner_1tm.adapter = element_array
        spinner_1tr.adapter = element_array

        spinner_1ml.adapter = element_array
        spinner_1mm.adapter = element_array
        spinner_1mr.adapter = element_array

        spinner_1bl.adapter = element_array
        spinner_1bm.adapter = element_array
        spinner_1br.adapter = element_array

        // Assign array adapter for auto community grid
        spinner_ac_1tl.adapter = element_array
        spinner_ac_1tm.adapter = element_array
        spinner_ac_1tr.adapter = element_array

        spinner_ac_1ml.adapter = element_array
        spinner_ac_1mm.adapter = element_array
        spinner_ac_1mr.adapter = element_array

        spinner_ac_1bl.adapter = element_array
        spinner_ac_1bm.adapter = element_array
        spinner_ac_1br.adapter = element_array

        //
        spinner_to_1tl.adapter = element_array
        spinner_to_1tm.adapter = element_array
        spinner_to_1tr.adapter = element_array

        spinner_to_1ml.adapter = element_array
        spinner_to_1mm.adapter = element_array
        spinner_to_1mr.adapter = element_array

        spinner_to_1bl.adapter = element_array
        spinner_to_1bm.adapter = element_array
        spinner_to_1br.adapter = element_array

        //
        spinner_2tl.adapter = element_array
        spinner_2tm.adapter = element_array
        spinner_2tr.adapter = element_array

        spinner_2ml.adapter = element_array
        spinner_2mm.adapter = element_array
        spinner_2mr.adapter = element_array

        spinner_2bl.adapter = element_array
        spinner_2bm.adapter = element_array
        spinner_2br.adapter = element_array

        auto_chargeS1.adapter = charge_adapter
        auto_chargeS2.adapter = charge_adapter

        var images = arrayOf(
            R.drawable._t1912_2019_logo
        )
/*
        binding.testImg.setOnClickListener { view ->
            testValue = testValue + 1
            if(testValue >= images.size)
                testValue = 0

            val imageView = view as ImageView
            val drawable = getDrawable(images[testValue])

            val snack = Snackbar.make(binding.root!!, drawable.toString(),1000000000)
            imageView.setImageDrawable(getDrawable(images[testValue]))


            snack.show()
        }
*/
        binding.floatingActionButton2.setOnClickListener { view ->
            SaveMatch()
        }


    }

    fun updateGridValue(pos: Int, id: Int) {
        find
        val parts = id.split(",").toTypedArray()

    }

    /*override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)

        val snack = Snackbar.make(view!!,"This is a simple Snackbar",10)
        snack.show()

        view?.setBackgroundColor(Color.WHITE)
    }
*/
    /*override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }
*/

    fun SaveMatch(){


        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
