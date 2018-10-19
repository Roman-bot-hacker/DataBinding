package com.eliot.ltq.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        mainViewModel.currentRandomFruitName.observe(this , Observer {
            textView.text = it
        })

        button.setOnClickListener {
            mainViewModel.onChangeRandomFruitClick()
        } }


    fun <T> LiveData<T>.observe(observe:(T?)->Unit) = observe(this@MainActivity, Observer {
        observe (it)
    })
}
