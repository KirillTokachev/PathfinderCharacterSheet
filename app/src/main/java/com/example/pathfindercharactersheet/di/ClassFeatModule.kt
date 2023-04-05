package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.ClassFeatDao
import com.example.pathfindercharactersheet.data.repository_impls.ClassFeatRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.ClassFeatRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface ClassFeatModule {

    @Binds
    fun bindClassFeatRepository(impl: ClassFeatRepositoryImpl): ClassFeatRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideClassFeatDao(application: Application): ClassFeatDao {
            return AppDataBase.getInstance(application).getClassFeatDao()
        }
    }
}