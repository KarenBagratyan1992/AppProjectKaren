package com.example.appprojectkaren.domein.usecase

import org.koin.dsl.module

val getUseCaseKoinModule = module {
    factory { GetLoginPasswordUseCase (user = get())
    }
}