package com.example.pathfindercharactersheet.data.database.db_models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pathfindercharactersheet.domain.models.*

@Entity(tableName = "characters")
data class CharacterDbModel(
    @PrimaryKey
    val id: Long,
    val name: String,
    val race: Race,
    val background: Background,
    val _class: Class,
    val ability: Ability,
    val feats: List<Feat>,
    val skills: List<Skills>,
    val weapons: List<Weapon>,
    val armor: Armor,
    val shield: Shield,
    val headItem: HeadItem,
    val headBandItem: HeadBandItem,
    val eyesItem: EyesItem,
    val shoulderItem: ShoulderItem,
    val neckItem: NeckItem,
    val chestItem: ChestItem,
    val bodyItem: BodyItem,
    val beltItem: BeltItem,
    val wristsItem: WristsItem,
    val handItem: HandItem,
    val rings: List<Ring>,
    val attack: Int,
    val damage: Int,
    val armorClass: Int,
    val initiative: Int
)
