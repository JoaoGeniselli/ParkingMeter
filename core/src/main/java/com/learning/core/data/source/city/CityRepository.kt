package com.learning.core.data.source.city

import com.learning.core.data.source.city.City

interface CityRepository {
    suspend fun findAllCities(): List<City>
    suspend fun findCityById(id: String): City?
    suspend fun findCitiesByName(name: String): List<City>
}