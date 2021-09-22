package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databinding.adapter.UserAdapter
import com.example.databinding.databinding.ActivityBindingRecyclerviewBinding
import com.example.databinding.model.User

class BindingRecyclerViewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)
        val binding: ActivityBindingRecyclerviewBinding = DataBindingUtil.setContentView(this, R.layout.activity_binding_recyclerview)

        val mAdapter = UserAdapter()
        mAdapter.userList = createData()

        binding.rcy.setHasFixedSize(true)
        binding.rcy.layoutManager = LinearLayoutManager(this)
        binding.rcy.adapter = mAdapter



    }

    private fun createData(): MutableList<User> {
        val users = mutableListOf<User>()

        for (i in 1..30) {
            val user = User(i, "name $i")
            users.add(user)
        }
        users.shuffle()
        return users
    }
}