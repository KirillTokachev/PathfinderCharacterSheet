package com.example.pathfindercharactersheet.di

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AbilityModule::class,
        BackgroundModule::class,
        CharacterModule::class,
        ClassFeatModule::class,
        ClassModule::class,
        EquipmentModule::class,
        FeatModule::class,
        RaceModule::class,
        SkillsModule::class
    ]
)
interface ApplicationComponent {


    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application,
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}