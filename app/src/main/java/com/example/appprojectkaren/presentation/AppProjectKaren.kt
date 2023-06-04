package com.example.appprojectkaren.presentation

import android.app.Application
import com.example.appprojectkaren.data.localdatasource.sharedPref.storageDi.mainRepoKoinModel
import com.example.appprojectkaren.data.localdatasource.storage.localDataStorageDi.localDataStorageImpleKoinModel
import com.example.appprojectkaren.domein.usecase.getUseCaseKoinModule
import com.example.appprojectkaren.domein.usecase.useCaseDi.saveUseCaseKoinModel
import com.example.appprojectkaren.presentation.mvvmDi.mvvmKoinModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppProjectKaren:Application() {

        override fun onCreate() {
            super.onCreate()
            startKoin {
                androidContext(this@AppProjectKaren)
                modules(getUseCaseKoinModule,
                    saveUseCaseKoinModel,
                    mainRepoKoinModel,
                    localDataStorageImpleKoinModel,
                    mvvmKoinModel
                )
            }
        }
    }
