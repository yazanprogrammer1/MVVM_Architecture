package com.example.mvvm_architecture1.repositery

import androidx.lifecycle.MutableLiveData
import com.example.mvvm_architecture1.model.Person
import java.util.Calendar

class CalculateAgeImpl : CalculateAge {
    // هذا الكلاس سيعمل امليمنت لكلاس ال interface
    override fun calculateYourAge(name: String, age: String): MutableLiveData<Person> {
        val infoMutLiveData = MutableLiveData<Person>()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge = currentYear - age.toInt()
        val person = Person(name, yourAge)
        infoMutLiveData.postValue(person)
        return infoMutLiveData
    }
}