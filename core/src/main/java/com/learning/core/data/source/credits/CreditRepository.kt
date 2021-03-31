package com.learning.core.data.source.credits

interface CreditRepository {
    suspend fun findAvailableCredits(): Double
    suspend fun purchaseCredits(value: Double)
    suspend fun useCredits(value: Double)
}