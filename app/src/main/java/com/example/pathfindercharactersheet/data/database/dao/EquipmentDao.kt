package com.example.pathfindercharactersheet.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.pathfindercharactersheet.data.database.db_models.*
import com.example.pathfindercharactersheet.domain.models.BeltItem

@Dao
interface EquipmentDao {

    @Insert(entity = ArmorDbModel::class, onConflict = REPLACE)
    suspend fun downloadArmors(armors: List<ArmorDbModel>)

    @Query("SELECT * FROM armor")
    suspend fun loadArmors(): List<ArmorDbModel>

    @Insert(entity = BeltItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadBeltItems(beltItems: List<BeltItemDbModel>)

    @Query("SELECT * FROM belts")
    suspend fun loadBeltItems(): List<BeltItemDbModel>

    @Insert(entity = BodyItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadBodyItems(bodyItems: List<BodyItemDbModel>)

    @Query("SELECT * FROM bodyItem")
    suspend fun loadBodyItems(): List<BodyItemDbModel>

    @Insert(entity = ChestItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadChestItems(chestItems: List<ChestItemDbModel>)

    @Query("SELECT * FROM chestItem")
    suspend fun loadChestItems(): List<ChestItemDbModel>

    @Insert(entity = EyesItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadEyesItems(eyesItems: List<EyesItemDbModel>)

    @Query("SELECT * FROM eyesItems")
    suspend fun loadEyesItems(): List<EyesItemDbModel>

    @Insert(entity = HandItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadHandItems(handItems: List<HandItemDbModel>)

    @Query("SELECT * FROM handItems")
    suspend fun loadHandItems(): List<HandItemDbModel>

    @Insert(entity = HeadBandItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadHeadBandItems(headBandItems: List<HeadBandItemDbModel>)

    @Query("SELECT * FROM headBandItems")
    suspend fun loadHeadBandItems(): List<HeadBandItemDbModel>

    @Insert(entity = HeadItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadHeadItems(headItems: List<HeadItemDbModel>)

    @Query("SELECT * FROM headItems")
    suspend fun loadHeadItems(): List<HeadItemDbModel>

    @Insert(entity = NeckItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadNeckItems(neckItems: List<NeckItemDbModel>)

    @Query("SELECT * FROM neckItems")
    suspend fun loadNeckItems(): List<NeckItemDbModel>

    @Insert(entity = RingDbModel::class, onConflict = REPLACE)
    suspend fun downloadRings(rings: List<RingDbModel>)

    @Query("SELECT * FROM rings")
    suspend fun loadRings(): List<RingDbModel>

    @Insert(entity = ShieldDbModel::class, onConflict = REPLACE)
    suspend fun downloadShields(shields: List<ShieldDbModel>)

    @Query("SELECT * FROM shields")
    suspend fun loadShields(): List<ShieldDbModel>

    @Insert(entity = ShoulderItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadShoulderItems(shoulderItems: List<ShoulderItemDbModel>)

    @Query("SELECT * FROM shoulderItems")
    suspend fun loadShoulderItems(): List<ShoulderItemDbModel>

    @Insert(entity = WeaponDbModel::class, onConflict = REPLACE)
    suspend fun downloadWeapons(weapons: List<WeaponDbModel>)

    @Query("SELECT * FROM weapons")
    suspend fun loadWeapons(): List<WeaponDbModel>

    @Insert(entity = WristsItemDbModel::class, onConflict = REPLACE)
    suspend fun downloadWristItems(wristItems: List<WristsItemDbModel>)

    @Query("SELECT * FROM wristsItems")
    suspend fun loadWristItems(): List<WristsItemDbModel>
}