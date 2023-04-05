package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.EquipmentDao
import com.example.pathfindercharactersheet.data.mappers.*
import com.example.pathfindercharactersheet.domain.models.*
import com.example.pathfindercharactersheet.domain.repositiry.EquipmentRepository
import javax.inject.Inject

class EquipmentRepositoryImpl @Inject constructor(
    private val equipmentDao: EquipmentDao,
    private val armorDbModelMapToArmor: ArmorDbModelMapToArmor,
    private val armorMapToArmorDbModel: ArmorMapToArmorDbModel,
    private val beltItemDbModelMapToBeltItem: BeltItemDbModelMapToBeltItem,
    private val beltItemMapToBeltItemDbModel: BeltItemMapToBeltItemDbModel,
    private val bodyItemMapToBodyItemDbModel: BodyItemMapToBodyItemDbModel,
    private val bodyItemDbModelMapToBodyItem: BodyItemDbModelMapToBodyItem,
    private val eyesItemDbModelMapToEyesItem: EyesItemDbModelMapToEyesItem,
    private val eyesItemMapToEyesItemDbModel: EyesItemMapToEyesItemDbModel,
    private val handItemDbModelMapToHandItem: HandItemDbModelMapToHandItem,
    private val handItemMapToHandItemDbModel: HandItemMapToHandItemDbModel,
    private val headBandItemMapToHeadBandDbModel: HeadBandItemMapToHeadBandDbModel,
    private val headBandItemDbModelMapToHeadBandItem: HeadBandItemDbModelMapToHeadBandItem,
    private val headItemDbModelMapToHeadItem: HeadItemDbModelMapToHeadItem,
    private val headItemMapToHeadItemDbModel: HeadItemMapToHeadItemDbModel,
    private val neckItemDbModelMapToNeckItem: NeckItemDbModelMapToNeckItem,
    private val neckItemMapToNeckItemDbModel: NeckItemMapToNeckItemDbModel,
    private val ringDbModelMapToRing: RingDbModelMapToRing,
    private val ringMapToRingDbModel: RingMapToRingDbModel,
    private val shieldDbModelMapToShield: ShieldDbModelMapToShield,
    private val shieldMapToShieldDbModel: ShieldMapToShieldDbModel,
    private val shoulderItemDbModelMapToShoulderItem: ShoulderItemDbModelMapToShoulderItem,
    private val shoulderItemMapToShoulderItemDbModel: ShoulderItemMapToShoulderItemDbModel,
    private val weaponDbModelMapToWeapon: WeaponDbModelMapToWeapon,
    private val weaponMapToWeaponDbModel: WeaponMapToWeaponDbModel,
    private val wristsItemDbModelMapToWristsItem: WristsItemDbModelMapToWristsItem,
    private val wristsItemMapToWristsItemDbModel: WristsItemMapToWristsItemDbModel,
    private val chestItemDbModelMapToChestItem: ChestItemDbModelMapToChestItem,
    private val chestItemMapToChestItemDbModel: ChestItemMapToChestItemDbModel
    ) : EquipmentRepository {

    override suspend fun downloadArmors(armors: List<Armor>) {
        equipmentDao.downloadArmors(armors.map(armorMapToArmorDbModel))
    }

    override suspend fun loadArmors(): List<Armor> {
       return equipmentDao.loadArmors().map(armorDbModelMapToArmor)
    }

    override suspend fun downloadBeltsItem(beltsItem: List<BeltItem>) {
        equipmentDao.downloadBeltItems(beltsItem.map(beltItemMapToBeltItemDbModel))
    }

    override suspend fun loadBeltsItem(): List<BeltItem> {
        return equipmentDao.loadBeltItems().map(beltItemDbModelMapToBeltItem)
    }

    override suspend fun downloadBodyItems(bodyItems: List<BodyItem>) {
        equipmentDao.downloadBodyItems(bodyItems.map(bodyItemMapToBodyItemDbModel))
    }

    override suspend fun loadBodyItem(): List<BodyItem> {
        return equipmentDao.loadBodyItems().map(bodyItemDbModelMapToBodyItem)
    }

    override suspend fun downloadChestItems(chestItems: List<ChestItem>) {
        equipmentDao.downloadChestItems(chestItems.map(chestItemMapToChestItemDbModel))
    }

    override suspend fun loadChestItems(): List<ChestItem> {
        return equipmentDao.loadChestItems().map(chestItemDbModelMapToChestItem)
    }

    override suspend fun downloadEyesItems(eyesItems: List<EyesItem>) {
        equipmentDao.downloadEyesItems(eyesItems.map(eyesItemMapToEyesItemDbModel))
    }

    override suspend fun loadEyesItems(): List<EyesItem> {
        return equipmentDao.loadEyesItems().map(eyesItemDbModelMapToEyesItem)
    }

    override suspend fun downloadHandItems(handItems: List<HandItem>) {
        equipmentDao.downloadHandItems(handItems.map(handItemMapToHandItemDbModel))
    }

    override suspend fun loadHandItems(): List<HandItem> {
        return equipmentDao.loadHandItems().map(handItemDbModelMapToHandItem)
    }

    override suspend fun downloadHeadBandItems(headBandItems: List<HeadBandItem>) {
        equipmentDao.downloadHeadBandItems(headBandItems.map(headBandItemMapToHeadBandDbModel))
    }

    override suspend fun loadHeadBandItems(): List<HeadBandItem> {
        return equipmentDao.loadHeadBandItems().map(headBandItemDbModelMapToHeadBandItem)
    }

    override suspend fun downloadHeadItems(headItems: List<HeadItem>) {
        equipmentDao.downloadHeadItems(headItems.map(headItemMapToHeadItemDbModel))
    }

    override suspend fun loadHeadItems(): List<HeadItem> {
        return equipmentDao.loadHeadItems().map(headItemDbModelMapToHeadItem)
    }

    override suspend fun downloadNeckItems(neckItems: List<NeckItem>) {
        equipmentDao.downloadNeckItems(neckItems.map(neckItemMapToNeckItemDbModel))
    }

    override suspend fun loadNeckItems(): List<NeckItem> {
        return equipmentDao.loadNeckItems().map(neckItemDbModelMapToNeckItem)
    }

    override suspend fun downloadRings(rings: List<Ring>) {
        equipmentDao.downloadRings(rings.map(ringMapToRingDbModel))
    }

    override suspend fun loadRings(): List<Ring> {
        return equipmentDao.loadRings().map(ringDbModelMapToRing)
    }

    override suspend fun downloadShields(shields: List<Shield>) {
        equipmentDao.downloadShields(shields.map(shieldMapToShieldDbModel))
    }

    override suspend fun loadShields(): List<Shield> {
        return equipmentDao.loadShields().map(shieldDbModelMapToShield)
    }

    override suspend fun downloadShoulderItems(shoulderItems: List<ShoulderItem>) {
        equipmentDao.downloadShoulderItems(shoulderItems.map(shoulderItemMapToShoulderItemDbModel))
    }

    override suspend fun loadShoulderItems(): List<ShoulderItem> {
        return equipmentDao.loadShoulderItems().map(shoulderItemDbModelMapToShoulderItem)
    }

    override suspend fun downloadWeapons(weapons: List<Weapon>) {
        equipmentDao.downloadWeapons(weapons.map(weaponMapToWeaponDbModel))
    }

    override suspend fun loadWeapons(): List<Weapon> {
        return equipmentDao.loadWeapons().map(weaponDbModelMapToWeapon)
    }

    override suspend fun downloadWristItems(wristItems: List<WristsItem>) {
        equipmentDao.downloadWristItems(wristItems.map(wristsItemMapToWristsItemDbModel))
    }

    override suspend fun loadWristItems(): List<WristsItem> {
        return equipmentDao.loadWristItems().map(wristsItemDbModelMapToWristsItem)
    }
}