package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.SkillsDao
import com.example.pathfindercharactersheet.data.repository_impls.SkillsRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.SkillsRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface SkillsModule {

    @Binds
    fun bindSkillsRepository(impl: SkillsRepositoryImpl): SkillsRepository

    companion object {
        @JvmStatic
        @Provides
        fun provideSkillsDao(application: Application): SkillsDao {
            return AppDataBase.getInstance(application).getSkillsDao()
        }
    }
}