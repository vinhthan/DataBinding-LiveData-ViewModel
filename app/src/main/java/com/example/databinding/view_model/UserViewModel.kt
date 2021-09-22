package com.example.databinding.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {
    private val _firstName: MutableLiveData<String> = MutableLiveData("name")
    private val _lastName: MutableLiveData<String> = MutableLiveData("name")
    private val _like: MutableLiveData<Int> = MutableLiveData()

    val firstName: LiveData<String> = _firstName
    val lastName: LiveData<String> = _lastName
    val like: LiveData<Int> = _like

    fun setFirstName(firstName: String) {
        _firstName.value = firstName
    }
    fun setLastName(lastName: String) {
        _lastName.value = lastName
    }
    fun onLike() {
        _like.value = (_like.value ?: 0) + 1
    }

}