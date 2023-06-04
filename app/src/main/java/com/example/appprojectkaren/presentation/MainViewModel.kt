package com.example.appprojectkaren.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appprojectkaren.domein.models.LoginPasswordModel
import com.example.appprojectkaren.domein.usecase.GetLoginPasswordUseCase
import com.example.appprojectkaren.domein.usecase.SaveLoginPasswordUseCase

class MainViewModel(
    private val getLoginPasswordUseCase: GetLoginPasswordUseCase,
    private val saveLoginPasswordUseCase: SaveLoginPasswordUseCase
) : ViewModel() {


    private val _data: MutableLiveData<String> = MutableLiveData()
    var data: LiveData<String> = _data


    suspend fun saved(log: String, pass: String) {
        val text = LoginPasswordModel(login = log, password = pass)

        val result = saveLoginPasswordUseCase.execute(text)
        _data.postValue(result.toString())


    }

    suspend fun getData(): String {
        val user = getLoginPasswordUseCase.execute()
        val result = "${user.login} ${user.password}"
        _data.postValue(result)
        return result

    }
}