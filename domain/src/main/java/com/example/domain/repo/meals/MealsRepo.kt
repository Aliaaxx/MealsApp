package com.example.domain.repo.meals

import com.example.domain.entity.meals.MealsModelResponseX

interface MealsRepo {
    suspend fun getMealsCategoriesFromRemote() : MealsModelResponseX
}