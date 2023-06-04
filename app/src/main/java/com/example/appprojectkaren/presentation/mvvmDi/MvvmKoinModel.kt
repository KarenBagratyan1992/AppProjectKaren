package com.example.appprojectkaren.presentation.mvvmDi

import com.example.appprojectkaren.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mvvmKoinModel = module { viewModel { MainViewModel(
    getLoginPasswordUseCase = get(),
    saveLoginPasswordUseCase = get()) } }