package com.example.pathfindercharactersheet.domain.repositiry

import com.example.pathfindercharactersheet.domain.models.Class

interface ClassRepository {

    fun setClasses(classes: List<Class>)

    fun getClasses(): List<Class>
}