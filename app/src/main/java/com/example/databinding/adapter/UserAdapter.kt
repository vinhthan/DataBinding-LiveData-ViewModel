package com.example.databinding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.ItemUserBinding
import com.example.databinding.model.User

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    class UserViewHolder(private val userItemUserBinding: ItemUserBinding) : RecyclerView.ViewHolder(userItemUserBinding.root) {
        fun onBind(user: User) {
            userItemUserBinding.user = user
        }
    }

    var userList: List<User> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val userItemBinding = ItemUserBinding.inflate(inflater, parent, false)
        return UserViewHolder(userItemBinding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int = userList.size
}