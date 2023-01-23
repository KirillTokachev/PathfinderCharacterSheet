package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.*

interface EquipmentRepository {

    suspend fun downloadArmors(armors: List<Armor>)
    suspend fun loadArmors(): List<Armor>

    suspend fun downloadBeltsItem(beltsItem: List<BeltItem>)
    suspend fun loadBeltsItem(): List<BeltItem>

    suspend fun downloadBodyItems(bodyItems: List<BodyItem>)
    suspend fun loadBodyItem(): List<BodyItem>

    suspend fun downloadChestItems(chestItems: List<ChestItem>)
    suspend fun loadChestItems(): List<ChestItem>

    suspend fun downloadEyesItems(eyesItems: List<EyesItem>)
    suspend fun loadEyesItems(): List<EyesItem>

    suspend fun downloadHandItems(handItems: List<HandItem>)
    suspend fun loadHandItems(): List<HandItem>

    suspend fun downloadHeadBandItems(headBandItems: List<HeadBandItem>)
    suspend fun loadHeadBandItems(): List<HeadBandItem>

    suspend fun downloadHeadItems(headItems: List<HeadItem>)
    suspend fun loadHeadItems(): List<HeadItem>

    suspend fun downloadNeckItems(neckItems: List<NeckItem>)
    suspend fun loadNeckItems(): List<NeckItem>

    suspend fun downloadRings(rings: List<Ring>)
    suspend fun loadRings(): List<Ring>

    suspend fun downloadShields(shields: List<Shield>)
    suspend fun loadShields(): List<Shield>

    suspend fun downloadShoulderItems(shoulderItems: List<ShoulderItem>)
    suspend fun loadShoulderItems(): List<ShoulderItem>

    suspend fun downloadWeapons(weapons: List<Weapon>)
    suspend fun loadWeapons(): List<Weapon>

    suspend fun downloadWristItems(wristItems: List<WristsItem>)
    suspend fun loadWristItems(): List<WristsItem>
}