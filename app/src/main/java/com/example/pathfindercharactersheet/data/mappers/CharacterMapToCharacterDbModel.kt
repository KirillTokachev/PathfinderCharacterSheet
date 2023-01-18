package com.example.pathfindercharactersheet.data.mappers

import com.example.pathfindercharactersheet.data.database.db_models.CharacterDbModel
import com.example.pathfindercharactersheet.domain.models.Character

class CharacterMapToCharacterDbModel: (Character) -> CharacterDbModel {

    override fun invoke(character: Character) =
        with(character) {
            CharacterDbModel(
                id = id,
                race = race,
                background = background,
                _class = _class,
                ability = ability,
                feats = feats,
                skills = skills,
                weapons = weapons,
                armor = armor,
                shield = shield,
                headItem = headItem,
                headBandItem = headBandItem,
                eyesItem = eyesItem,
                shoulderItem = shoulderItem,
                neckItem = neckItem,
                chestItem = chestItem,
                bodyItem = bodyItem,
                beltItem = beltItem,
                wristsItem = wristsItem,
                handItem = handItem,
                rings = rings,
                attack = attack,
                damage = damage,
                armorClass = armorClass,
                initiative = initiative
            )
        }
}