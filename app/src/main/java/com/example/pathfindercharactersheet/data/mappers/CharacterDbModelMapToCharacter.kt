package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.CharacterDbModel
import com.example.pathfindercharactersheet.domain.models.Character
import javax.inject.Inject

class CharacterDbModelMapToCharacter @Inject constructor(
    val raceDbModelMapToRace: RaceDbModelMapToRace,
    val backgroundDbModelMapToBackground: BackgroundDbModelMapToBackground,
    val classDbModelMapToClass: ClassDbModelMapToClass,
    val abilityDbModelMapToAbility: AbilityDbModelMapToAbility,
    val featDbModelMapToFeat: FeatDbModelMapToFeat,
    val skillsDbModelMapToSkills: SkillsDbModelMapToSkills,
    val weaponDbModelMapToWeapon: WeaponDbModelMapToWeapon,
    val armorDbModelMapToArmor: ArmorDbModelMapToArmor,
    val shieldDbModelMapToShield: ShieldDbModelMapToShield,
    val headItemDbModelMapHeadItem: HeadItemDbModelMapToHeadItem,
    val headBandDbModelMapToHeadItem: HeadBandItemDbModelMapToHeadBandItem,
    val eyesItemDbModelMapToEyesItem: EyesItemDbModelMapToEyesItem,
    val shoulderItemDbModelMapToShoulderItem: ShoulderItemDbModelMapToShoulderItem,
    val neckItemDbModelMapToNeckItem: NeckItemDbModelMapToNeckItem,
    val chestItemDbModelMapToChestItem: ChestItemDbModelMapToChestItem,
    val bodyItemDbModelMapToBodyItem: BodyItemDbModelMapToBodyItem,
    val beltItemDbModelMapToBeltItem: BeltItemDbModelMapToBeltItem,
    val wristsItemDbModelMapToWristsItem: WristsItemDbModelMapToWristsItem,
    val handItemDbModelMapToHandItem: HandItemDbModelMapToHandItem,
    val ringDbModelMapToRing: RingDbModelMapToRing
    ) : (CharacterDbModel) -> Character {

    override fun invoke(characterDbModel: CharacterDbModel) =
        with(characterDbModel) {
            Character(
                id = id,
                name = name,
                race = raceDbModelMapToRace(race),
                background = backgroundDbModelMapToBackground(background),
                _class = classDbModelMapToClass(_class),
                ability = abilityDbModelMapToAbility(ability),
                feats = feats.map {featDbModelMapToFeat(it)},
                skills = skills.map {skillsDbModelMapToSkills(it)},
                weapons = weapons.map {weaponDbModelMapToWeapon(it)},
                armor = armorDbModelMapToArmor(armor),
                shield = shieldDbModelMapToShield(shield),
                headItem = headItemDbModelMapHeadItem(headItem),
                headBandItem = headBandDbModelMapToHeadItem(headBandItem),
                eyesItem = eyesItemDbModelMapToEyesItem(eyesItem),
                shoulderItem = shoulderItemDbModelMapToShoulderItem(shoulderItem),
                neckItem = neckItemDbModelMapToNeckItem(neckItem),
                chestItem = chestItemDbModelMapToChestItem(chestItem),
                bodyItem = bodyItemDbModelMapToBodyItem(bodyItem),
                beltItem = beltItemDbModelMapToBeltItem(beltItem),
                wristsItem = wristsItemDbModelMapToWristsItem(wristsItem),
                handItem = handItemDbModelMapToHandItem(handItem),
                rings = rings.map {ringDbModelMapToRing(it)},
                attack = attack,
                damage = damage,
                armorClass = armorClass,
                initiative = initiative
            )
        }
}