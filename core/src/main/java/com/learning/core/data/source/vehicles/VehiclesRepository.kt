package com.learning.core.data.source.vehicles

interface VehiclesRepository {
    suspend fun addCar(plate: String, description: String)
    suspend fun removeCar(plate: String)
    suspend fun findAllCars(): List<Vehicle>
}