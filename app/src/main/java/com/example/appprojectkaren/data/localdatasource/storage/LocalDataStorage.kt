package com.example.appprojectkaren.data.localdatasource.storage

import com.example.appprojectkaren.data.ModelsDataSource
import com.example.appprojectkaren.domein.models.LoginPasswordModel

interface LocalDataStorage {
    suspend fun savedLog(saveParam: ModelsDataSource)
    suspend fun getLog(): ModelsDataSource
}