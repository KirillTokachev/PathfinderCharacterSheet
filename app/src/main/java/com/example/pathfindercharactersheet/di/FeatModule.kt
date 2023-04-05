package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.FeatDao
import com.example.pathfindercharactersheet.data.repository_impls.FeatRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.FeatRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface FeatModule {

    @Binds
    fun bindFeatRepository(impl: FeatRepositoryImpl): FeatRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideFeatDao(application: Application): FeatDao {
            return AppDataBase.getInstance(application).getFeatDao()
        }
    }
}