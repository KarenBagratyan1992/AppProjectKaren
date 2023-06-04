package com.example.appprojectkaren.data.localdatasource.storage.localDataStorageDi

import com.example.appprojectkaren.data.localdatasource.storage.LocalDataStorageImple
import org.koin.dsl.module

val localDataStorageImpleKoinModel = module { single { LocalDataStorageImple(context = get()) } }