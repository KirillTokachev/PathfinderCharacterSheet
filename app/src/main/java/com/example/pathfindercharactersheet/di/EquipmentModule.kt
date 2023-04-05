package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.EquipmentDao
import com.example.pathfindercharactersheet.data.repository_impls.EquipmentRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.EquipmentRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface EquipmentModule {

    @Binds
    fun bindEquipmentRepository(impl: EquipmentRepositoryImpl): EquipmentRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideEquipmentDao(application: Application): EquipmentDao {
            return AppDataBase.getInstance(application).getEquipmentDao()
        }
    }

}