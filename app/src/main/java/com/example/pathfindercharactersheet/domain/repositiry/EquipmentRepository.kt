package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.*

interface EquipmentRepository {

    fun setArmors(armors: List<Armor>)
    fun getArmors(): List<Armor>

    fun setBeltsItem(beltsItem: List<BeltItem>)
    fun getBeltsItem(): List<BeltItem>

    fun setBodyItems(bodyItems: List<BodyItem>)
    fun getBodyItem(): List<BodyItem>

    fun setChestItems(chestItems: List<ChestItem>)
    fun getChestItems(): List<ChestItem>

    fun setEyesItems(eyesItems: List<EyesItem>)
    fun getEyesItems(): List<EyesItem>

    fun setHandItems(handItems: List<HandItem>)
    fun getHandItems(): List<HandItem>

    fun setHeadBandItems(headBandItems: List<HeadBandItem>)
    fun getHeadBandItems(): List<HeadBandItem>

    fun setHeadItems(headItems: List<HeadItem>)
    fun getHeadItems(): List<HeadItem>

    fun setNeckItems(neckItems: List<NeckItem>)
    fun getNeckItems(): List<NeckItem>

    fun setRings(rings: List<Ring>)
    fun getRings(): List<Ring>

    fun setShields(shields: List<Shield>)
    fun getShields(): List<Shield>

    fun setShoulderItems(shoulderItems: List<ShoulderItem>)
    fun getShoulderItems(): List<ShoulderItem>

    fun setWeapons(weapons: List<Weapon>)
    fun getWeapons(): List<Weapon>

    fun setWristItems(wristItems: List<WristsItem>)
    fun getWristItems(): List<WristsItem>
}