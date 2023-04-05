package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.BackgroundDao
import com.example.pathfindercharactersheet.data.repository_impls.BackgroundRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.BackgroundRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface BackgroundModule {

    @Binds
    fun bindBackgroundRepository(impl: BackgroundRepositoryImpl): BackgroundRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideBackgroundDao(application: Application): BackgroundDao {
            return AppDataBase.getInstance(application).getBackgroundDao()
        }
    }
}