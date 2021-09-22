package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityDataBindingViewModelBinding
import com.example.databinding.view_model.UserViewModel

class DataBindingViewModelActivity : AppCompatActivity() {

    private val viewModel: UserViewModel by lazy {
        ViewModelProvider(this)[UserViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding_view_model)
        val binding: ActivityDataBindingViewModelBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_view_model)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        viewModel.setFirstName("name 1")
        viewModel.setLastName("name 2")

    }
}