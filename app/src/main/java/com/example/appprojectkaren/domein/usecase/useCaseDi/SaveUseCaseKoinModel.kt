package com.example.appprojectkaren.domein.usecase.useCaseDi

import com.example.appprojectkaren.domein.usecase.GetLoginPasswordUseCase
import com.example.appprojectkaren.domein.usecase.SaveLoginPasswordUseCase
import org.koin.dsl.module

val saveUseCaseKoinModel = module {
    factory {
        SaveLoginPasswordUseCase(mainRepo = get())
    }
}
