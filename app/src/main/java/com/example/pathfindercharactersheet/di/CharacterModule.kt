package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.CharacterDao
import com.example.pathfindercharactersheet.data.repository_impls.CharacterRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface CharacterModule {

    @Binds
    fun bindCharacterRepository(impl: CharacterRepositoryImpl): CharacterRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideCharacterDao(application: Application): CharacterDao {
            return AppDataBase.getInstance(application).getCharacterDao()
        }
    }
}