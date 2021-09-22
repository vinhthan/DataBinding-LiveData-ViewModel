package com.example.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityDatabindingBinding

class DataBindingActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityDatabindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);

        binding.btnSum.setOnClickListener {
            var numA: Int = binding.edtNumberA.text.toString().toInt()
            var numB: Int = binding.edtNumberB.text.toString().toInt()

            //binding.tvSum.text = (numA + numB).toString()
            binding.sum = numA + numB
        }


        binding.btnRcy.setOnClickListener {
            val intent = Intent(this, BindingRecyclerViewActivity2::class.java)
            startActivity(intent)
        }

        binding.btnAdapter.setOnClickListener {
            val intent = Intent(this, BindingAdapterActivity3::class.java)
            startActivity(intent)
        }

        binding.btnLivedata.setOnClickListener {
            val intent = Intent(this, DataBindingViewModelActivity::class.java)
            startActivity(intent)
        }


    }
}