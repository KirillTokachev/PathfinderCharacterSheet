package com.example.pathfindercharactersheet.data.repository_impls

import com.example.pathfindercharactersheet.data.database.dao.AbilityDao
import com.example.pathfindercharactersheet.data.mappers.AbilityDbModelMapToAbility
import com.example.pathfindercharactersheet.data.mappers.AbilityMapToAbilityDbModel
import com.example.pathfindercharactersheet.domain.models.Ability
import com.example.pathfindercharactersheet.domain.repositiry.AbilityRepository

class AbilityRepositoryImpl(
    private val abilityDao: AbilityDao,
    private val abilityMapToAbilityDbModel: AbilityMapToAbilityDbModel,
    private val abilityDbModelMapToAbility: AbilityDbModelMapToAbility
) : AbilityRepository {

    override suspend fun downloadAbility(ability: List<Ability>) {
        abilityDao.downloadAbility(ability.map {abilityMapToAbilityDbModel(it)})
    }

    override suspend fun loadAbility(): List<Ability> {
        return abilityDao.loadAbility().map { abilityDbModelMapToAbility(it) }
    }
}