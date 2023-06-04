package com.example.appprojectkaren.data.localdatasource.sharedPref



import com.example.appprojectkaren.data.ModelsDataSource
import com.example.appprojectkaren.data.localdatasource.storage.LocalDataStorage
import com.example.appprojectkaren.domein.models.LoginPasswordModel
import com.example.appprojectkaren.domein.repo.MainRepo


private const val SHARED_PREF = "SHARED_PREF"
private const val LOGIN_KEY = "login_key"
private const val PASSWORD_KEY = "password_key"

class MainRepoImple(private val storage: LocalDataStorage) : MainRepo {


    override suspend fun savedLoginPassword(saveParam: LoginPasswordModel) {
        val user = ModelsDataSource(login = saveParam.login, password = saveParam.password)
        val result = storage.savedLog(user)


    }

    override suspend fun getLoginPassword(): LoginPasswordModel {

        val user = storage.getLog()
        val userName = LoginPasswordModel(login = user.login, password = user.password)
        return userName


    }
}