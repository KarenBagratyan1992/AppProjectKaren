package com.example.appprojectkaren.data.localdatasource.sharedPref.storageDi

import com.example.appprojectkaren.data.localdatasource.sharedPref.MainRepoImple
import org.koin.dsl.module

val mainRepoKoinModel = module { single { MainRepoImple(storage = get()) } }