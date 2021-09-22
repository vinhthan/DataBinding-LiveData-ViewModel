package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityBindingAdapter3Binding

class BindingAdapterActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_binding_adapter3)
        val binding : ActivityBindingAdapter3Binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapter3)

        binding.btnSubmit.setOnClickListener {
            var age = binding.edtAge.text.toString().toInt()
            binding.age = age
        }

    }
}