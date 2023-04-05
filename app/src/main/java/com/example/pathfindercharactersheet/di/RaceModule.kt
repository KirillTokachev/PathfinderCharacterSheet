package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.RaceDao
import com.example.pathfindercharactersheet.data.repository_impls.RaceRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.RaceRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface RaceModule {

    @Binds
    fun bindRaceRepository(impl: RaceRepositoryImpl): RaceRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideRaceDao(application: Application): RaceDao {
            return AppDataBase.getInstance(application).getRaceDao()
        }
    }
}