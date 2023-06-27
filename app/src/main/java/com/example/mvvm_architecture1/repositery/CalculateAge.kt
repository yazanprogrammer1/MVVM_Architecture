package com.example.mvvm_architecture1.repositery

import androidx.lifecycle.MutableLiveData
import com.example.mvvm_architecture1.model.Person

interface CalculateAge {
    fun calculateYourAge(name: String, age: String): MutableLiveData<Person>
}