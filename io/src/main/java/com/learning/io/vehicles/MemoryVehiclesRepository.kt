package com.learning.io.vehicles

import com.learning.core.data.source.vehicles.Vehicle
import com.learning.core.data.source.vehicles.VehiclesRepository

class MemoryVehiclesRepository : VehiclesRepository {

    private val vehicles = mutableListOf(
        Vehicle("Peugeot 206", "EMI-1234"),
        Vehicle("Fiat Uno", "JAO-4321"),
        Vehicle("Marea Turbo", "BUM-6666"),
        Vehicle("Monza Relíquia", "FAB-1000"),
        Vehicle("Golzinho Quadrado", "ZIC-4444")
    )

    override suspend fun addCar(plate: String, description: String) {
        vehicles.add(Vehicle(plate, description))
    }

    override suspend fun removeCar(plate: String) {
        vehicles.firstOrNull { it.plate == plate }?.let { vehicles.remove(it) }
    }

    override suspend fun findAllCars(): List<Vehicle> = vehicles.toList()
}