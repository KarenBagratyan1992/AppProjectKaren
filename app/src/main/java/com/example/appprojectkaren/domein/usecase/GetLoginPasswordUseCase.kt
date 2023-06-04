package com.example.appprojectkaren.domein.usecase

import com.example.appprojectkaren.domein.models.LoginPasswordModel
import com.example.appprojectkaren.domein.repo.MainRepo

class GetLoginPasswordUseCase(val user:MainRepo) {
   suspend fun execute():LoginPasswordModel{
       val getUser = user.getLoginPassword()
        return getUser

    }
}