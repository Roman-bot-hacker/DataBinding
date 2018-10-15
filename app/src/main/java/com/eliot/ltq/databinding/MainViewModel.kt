package com.eliot.ltq.databinding

import android.arch.lifecycle.ViewModel
import android.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel(){

    val currentRandomFruitName: LiveData<String>
        get() = FakeRepository.currentRandomFruitName

    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()
}