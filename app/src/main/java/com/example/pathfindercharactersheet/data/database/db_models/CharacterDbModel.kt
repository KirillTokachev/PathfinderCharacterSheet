package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.pathfindercharactersheet.data.database.type_converters.*

@kotlinx.serialization.Serializable
@Entity(tableName = "characters")
data class CharacterDbModel(
    @PrimaryKey
    val id: Long,
    val name: String,
    @field:TypeConverters(RaceConverter::class)
    val race: RaceDbModel,
    @field:TypeConverters(BackgroundConverter::class)
    val background: BackgroundDbModel,
    @field:TypeConverters(ClassConverter::class)
    val _class: ClassDbModel,
    @field:TypeConverters(AbilityConverter::class)
    val ability: AbilityDbModel,
    @field:TypeConverters(FeatConverter::class)
    val feats: List<FeatDbModel>,
    @field:TypeConverters(SkillsConverter::class)
    val skills: List<SkillsDbModel>,
    @field:TypeConverters(WeaponConverter::class)
    val weapons: List<WeaponDbModel>,
    @field:TypeConverters(ArmorConverter::class)
    val armor: ArmorDbModel,
    @field:TypeConverters(ShieldConverter::class)
    val shield: ShieldDbModel,
    @field:TypeConverters(HeadItemConverter::class)
    val headItem: HeadItemDbModel,
    @field:TypeConverters(HeadBandItemConverter::class)
    val headBandItem: HeadBandItemDbModel,
    @field:TypeConverters(EyesItemConverter::class)
    val eyesItem: EyesItemDbModel,
    @field:TypeConverters(ShoulderItemConverter::class)
    val shoulderItem: ShoulderItemDbModel,
    @field:TypeConverters(NeckItemConverter::class)
    val neckItem: NeckItemDbModel,
    @field:TypeConverters(ChestItemConverter::class)
    val chestItem: ChestItemDbModel,
    @field:TypeConverters(BodyItemConverter::class)
    val bodyItem: BodyItemDbModel,
    @field:TypeConverters(BeltItemConverter::class)
    val beltItem: BeltItemDbModel,
    @field:TypeConverters(WristsItemConverter::class)
    val wristsItem: WristsItemDbModel,
    @field:TypeConverters(HandItemConverter::class)
    val handItem: HandItemDbModel,
    @field:TypeConverters(RingConverter::class)
    val rings: List<RingDbModel>,
    val attack: Int,
    val damage: Int,
    val armorClass: Int,
    val initiative: Int
)
