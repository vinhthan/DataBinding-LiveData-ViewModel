package com.example.databinding

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:age")
fun checkAge(view: View, age: Int) {
    val txt = view as TextView

    when {
        age < 18 -> {
            txt.text = "you are too young"
        }
        age >= 18 -> {
            txt.text = "eligible"
        }
        else -> {
            txt.text = "empty"
        }
    }
}

/*@BindingAdapter(value = ["age: age", "app: max"], requireAll = true)
fun checkAge(view: View, age: Int, max: Int) {
    val txt = view as TextView

    when {
        age < 18 -> {
            txt.text = ("you are too young")
        }
        (age >= 18) and (age <= max) -> {
            txt.text = ("eligible")
        }
        age > max ->{
            txt.text = ("you are to old")
        }
        else -> {
            txt.text = ("empty")
        }
    }
}*/
