package com.example.appprojectkaren.data.localdatasource.storage

import android.content.Context
import com.example.appprojectkaren.data.ModelsDataSource

import com.example.appprojectkaren.domein.models.LoginPasswordModel
private const  val SHARED_PREF = "SHARED_PREF"
private const val LOGIN_KEY = "login_key"
private const val PASSWORD_KEY = "password_key"

class LocalDataStorageImple(context: Context):LocalDataStorage {

    val sharedpref = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE)

    override suspend fun savedLog(saveParam: ModelsDataSource){
        sharedpref.edit().putString(LOGIN_KEY,saveParam.login).apply()
        sharedpref.edit().putString(PASSWORD_KEY,saveParam.password).apply()



    }

    override suspend fun getLog(): ModelsDataSource {
        val login = sharedpref.getString(LOGIN_KEY,"") ?: ""
        val password = sharedpref.getString(PASSWORD_KEY,"") ?:""

        return ModelsDataSource(login = login, password = password)


    }
}