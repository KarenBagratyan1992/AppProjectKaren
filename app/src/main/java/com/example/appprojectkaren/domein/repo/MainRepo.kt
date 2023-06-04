package com.example.appprojectkaren.domein.repo

import com.example.appprojectkaren.domein.models.LoginPasswordModel


interface MainRepo {
    suspend fun savedLoginPassword(saveParam: LoginPasswordModel)
    suspend fun getLoginPassword(): LoginPasswordModel
}