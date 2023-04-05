package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.ClassDao
import com.example.pathfindercharactersheet.data.repository_impls.ClassRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.ClassRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface ClassModule {

    @Binds
    fun bindClassRepository(impl: ClassRepositoryImpl): ClassRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideClassDao(application: Application): ClassDao {
            return AppDataBase.getInstance(application).getClassDao()
        }
    }
}