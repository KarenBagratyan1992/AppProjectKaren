package com.example.appprojectkaren.domein.usecase

import com.example.appprojectkaren.domein.models.LoginPasswordModel
import com.example.appprojectkaren.domein.repo.MainRepo

class SaveLoginPasswordUseCase(private val mainRepo: MainRepo) {
    suspend fun execute(model: LoginPasswordModel) {
        val user = LoginPasswordModel(login = model.login, password = model.password)
        val result = mainRepo.savedLoginPassword(user)


    }
}