package com.example.pathfindercharactersheet.di

import android.app.Application
import com.example.pathfindercharactersheet.data.database.AppDataBase
import com.example.pathfindercharactersheet.data.database.dao.AbilityDao
import com.example.pathfindercharactersheet.data.repository_impls.AbilityRepositoryImpl
import com.example.pathfindercharactersheet.domain.repositiry.AbilityRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface AbilityModule {

    @Binds
    fun bindAbilityRepository(impl: AbilityRepositoryImpl): AbilityRepository

 companion object {
     @JvmStatic
     @Provides
     fun provideAbilityDao(application: Application): AbilityDao {
         return  AppDataBase.getInstance(application).getAbilityDao()
     }
 }
}