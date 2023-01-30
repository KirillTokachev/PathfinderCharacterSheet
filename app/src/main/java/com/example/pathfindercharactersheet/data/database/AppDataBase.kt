package com.example.pathfindercharactersheet.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pathfindercharactersheet.data.database.dao.*
import com.example.pathfindercharactersheet.data.database.db_models.*


@Database(
    entities = [
        AbilityDbModel::class,
        ArmorDbModel::class,
        BackgroundDbModel::class,
        BeltItemDbModel::class,
        BodyItemDbModel::class,
        CharacterDbModel::class,
        ChestItemDbModel::class,
        ClassDbModel::class,
        ClassFeatDbModel::class,
        EyesItemDbModel::class,
        FeatDbModel::class,
        HandItemDbModel::class,
        HeadBandItemDbModel::class,
        HeadItemDbModel::class,
        NeckItemDbModel::class,
        RaceDbModel::class,
        RingDbModel::class,
        ShieldDbModel::class,
        ShoulderItemDbModel::class,
        SkillsDbModel::class,
        WeaponDbModel::class,
        WristsItemDbModel::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDataBase : RoomDatabase() {

    abstract fun getAbilityDao(): AbilityDao
    abstract fun getBackgroundDao(): BackgroundDao
    abstract fun getCharacterDao(): CharacterDao
    abstract fun getClassDao(): ClassDao
    abstract fun getClassFeatDao(): ClassFeatDao
    abstract fun getEquipmentDao(): EquipmentDao
    abstract fun getFeatDao(): FeatDao
    abstract fun getRaceDao(): RaceDao
    abstract fun getSkillsDao(): SkillsDao

    companion object {
        private var db: AppDataBase? = null
        private val LOCK = Any()

        fun getInstance(context: Context): AppDataBase {
            synchronized(LOCK) {
                db?.let { return it }
                val instance =
                    Room.databaseBuilder(
                        context,
                        AppDataBase::class.java,
                        "app_data_base",
                    ).fallbackToDestructiveMigration()
                        .build()
                db = instance
                return instance
            }
        }
    }
}