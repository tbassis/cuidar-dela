package com.poli.tulioassis.cuidardela.ui.profile

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel(val app: Application) : AndroidViewModel(app) {
    private val _text = MutableLiveData<String>().apply {

    }
    val text: LiveData<String> = _text


    //var name = ObservableField("")
    //var birth_date = ObservableField("")




}

//fun editProfileButton(view: View)