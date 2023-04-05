package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.CharacterDbModel
import com.example.pathfindercharactersheet.domain.models.Character
import javax.inject.Inject

class CharacterMapToCharacterDbModel @Inject constructor(
    val raceMapTorRaceDbModel: RaceMapTorRaceDbModel,
    val backgroundMapToBackgroundDbModel: BackgroundMapToBackgroundDbModel,
    val classMapToClassDbModel: ClassMapToClassDbModel,
    val abilityMapToAbilityDbModel: AbilityMapToAbilityDbModel,
    val featMapToFeatDbModel: FeatMapToFeatDbModel,
    val skillsMapToSkillsDbModel: SkillsMapToSkillsDbModel,
    val weaponMapToWeaponDbModel: WeaponMapToWeaponDbModel,
    val armorMapToArmorDbModel: ArmorMapToArmorDbModel,
    val shieldMapToShieldDbModel: ShieldMapToShieldDbModel,
    val handItemMapToHandItemDbModel: HandItemMapToHandItemDbModel,
    val headBandItemMapToHeadBandDbModel: HeadBandItemMapToHeadBandDbModel,
    val eyesItemMapToEyesItemDbModel: EyesItemMapToEyesItemDbModel,
    val shoulderItemMapToShoulderItemDbModel: ShoulderItemMapToShoulderItemDbModel,
    val headItemMapToHeadItemDbModel: HeadItemMapToHeadItemDbModel,
    val chestItemMapToChestItemDbModel: ChestItemMapToChestItemDbModel,
    val bodyItemMapToBodyItemDbModel: BodyItemMapToBodyItemDbModel,
    val beltItemMapToBeltItemDbModel: BeltItemMapToBeltItemDbModel,
    val wristsItemMapToWristsItemDbModel: WristsItemMapToWristsItemDbModel,
    val ringMapToRingDbModel: RingMapToRingDbModel,
    val neckItemMapToNeckItemDbModel: NeckItemMapToNeckItemDbModel
) : (Character) -> CharacterDbModel {

    override fun invoke(character: Character) =
        with(character) {
            CharacterDbModel(
                id = id,
                name = name,
                race = raceMapTorRaceDbModel(race),
                background = backgroundMapToBackgroundDbModel(background),
                _class = classMapToClassDbModel(_class),
                ability = abilityMapToAbilityDbModel(ability),
                feats = feats.map {featMapToFeatDbModel(it)},
                skills = skills.map {skillsMapToSkillsDbModel(it)},
                weapons = weapons.map {weaponMapToWeaponDbModel(it)},
                armor = armorMapToArmorDbModel(armor),
                shield = shieldMapToShieldDbModel(shield),
                headItem = headItemMapToHeadItemDbModel(headItem),
                headBandItem = headBandItemMapToHeadBandDbModel(headBandItem),
                eyesItem = eyesItemMapToEyesItemDbModel(eyesItem),
                shoulderItem = shoulderItemMapToShoulderItemDbModel(shoulderItem),
                neckItem = neckItemMapToNeckItemDbModel(neckItem),
                chestItem = chestItemMapToChestItemDbModel(chestItem),
                bodyItem = bodyItemMapToBodyItemDbModel(bodyItem),
                beltItem = beltItemMapToBeltItemDbModel(beltItem),
                wristsItem = wristsItemMapToWristsItemDbModel(wristsItem),
                handItem = handItemMapToHandItemDbModel(handItem),
                rings = rings.map {ringMapToRingDbModel(it)},
                attack = attack,
                damage = damage,
                armorClass = armorClass,
                initiative = initiative
            )
        }
}