package com.learning.core.data.source.parking

interface ParkingRepository {
    suspend fun orderParkingTime(
        carPlate: String,
        cityId: String,
        timeInMinutes: Int
    )
}