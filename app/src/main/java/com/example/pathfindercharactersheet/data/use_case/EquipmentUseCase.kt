package com.example.pathfindercharactersheet.data.use_case

import com.example.pathfindercharactersheet.domain.models.*
import com.example.pathfindercharactersheet.domain.repositiry.EquipmentRepository
import javax.inject.Inject

class EquipmentUseCase @Inject constructor(
    private val repository: EquipmentRepository
) {

    suspend fun downloadArmors(armors: List<Armor>) {
        repository.downloadArmors(armors)
    }

    suspend fun loadArmors(): List<Armor> {
        return repository.loadArmors()
    }

    suspend fun downloadBeltsItem(beltsItem: List<BeltItem>) {
        repository.downloadBeltsItem(beltsItem)
    }

    suspend fun loadBeltsItem(): List<BeltItem> {
        return repository.loadBeltsItem()
    }

    suspend fun downloadBodyItems(bodyItems: List<BodyItem>) {
        repository.downloadBodyItems(bodyItems)
    }

    suspend fun loadBodyItems(): List<BodyItem> {
        return repository.loadBodyItem()
    }

    suspend fun downloadChestItems(chestItems: List<ChestItem>) {
        repository.downloadChestItems(chestItems)
    }
    suspend fun loadChestItems(): List<ChestItem> {
        return repository.loadChestItems()
    }

    suspend fun downloadEyesItems(eyesItems: List<EyesItem>) {
        repository.downloadEyesItems(eyesItems)
    }

    suspend fun loadEyesItems(): List<EyesItem> {
        return repository.loadEyesItems()
    }

    suspend fun downloadHandItems(handItems: List<HandItem>) {
        repository.downloadHandItems(handItems)
    }

    suspend fun loadHandItems(): List<HandItem> {
        return  repository.loadHandItems()
    }

    suspend fun downloadHeadBandItems(headBandItems: List<HeadBandItem>) {
        repository.downloadHeadBandItems(headBandItems)
    }

    suspend fun loadHeadBandItems(): List<HeadBandItem> {
        return repository.loadHeadBandItems()
    }

    suspend fun downloadHeadItems(headItems: List<HeadItem>) {
        repository.downloadHeadItems(headItems)
    }

    suspend fun loadHeadItems(): List<HeadItem> {
        return repository.loadHeadItems()
    }

    suspend fun downloadNeckItems(neckItems: List<NeckItem>) {
        repository.downloadNeckItems(neckItems)
    }

    suspend fun loadNeckItems(): List<NeckItem> {
        return repository.loadNeckItems()
    }

    suspend fun downloadRings(rings: List<Ring>) {
        repository.downloadRings(rings)
    }

    suspend fun loadRings(): List<Ring> {
        return repository.loadRings()
    }

    suspend fun downloadShields(shields: List<Shield>) {
        repository.downloadShields(shields)
    }

    suspend fun loadShields(): List<Shield> {
        return repository.loadShields()
    }

    suspend fun downloadShoulderItems(shoulderItems: List<ShoulderItem>) {
        repository.downloadShoulderItems(shoulderItems)
    }

    suspend fun loadShoulderItems(): List<ShoulderItem> {
        return repository.loadShoulderItems()
    }

    suspend fun downloadWeapons(weapons: List<Weapon>) {
        repository.downloadWeapons(weapons)
    }

    suspend fun loadWeapons(): List<Weapon> {
        return repository.loadWeapons()
    }

    suspend fun downloadWristItems(wristItems: List<WristsItem>) {
        repository.downloadWristItems(wristItems)
    }

    suspend fun loadWristItems(): List<WristsItem> {
        return repository.loadWristItems()
    }
}