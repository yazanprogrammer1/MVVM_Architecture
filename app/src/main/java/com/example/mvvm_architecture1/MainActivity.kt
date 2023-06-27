package com.example.mvvm_architecture1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.mvvm_architecture1.viewModel.CalculateAgeViewModel

class MainActivity : AppCompatActivity() {

    lateinit var txtage: TextView
    lateinit var age: EditText
    lateinit var name: EditText
    lateinit var calculate: Button
    private val calculateAgeViewModel: CalculateAgeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //..
        txtage = findViewById(R.id.age)
        age = findViewById(R.id.age_)
        name = findViewById(R.id.name)
        calculate = findViewById(R.id.btn_calculate)

        calculate.setOnClickListener {
            val name_ = name.text.trim().toString()
            val age_ = age.text.trim().toString()
            calculateAgeViewModel.calculateAge(name_, age_).observe(this, Observer { person ->
                txtage.text = "${person.name} your age ${person.age}"
            })
        }
    }
}