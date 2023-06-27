package com.example.mvvm_architecture1.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_architecture1.model.Person
import com.example.mvvm_architecture1.repositery.CalculateAge
import com.example.mvvm_architecture1.repositery.CalculateAgeImpl

class CalculateAgeViewModel : ViewModel() {

    val calculateAgeRepo: CalculateAge = CalculateAgeImpl()
    fun calculateAge(name: String, age: String): LiveData<Person> {
        var person_liveData = calculateAgeRepo.calculateYourAge(name, age)
        return person_liveData
    }

}