package com.learning.core.data.source.payment

interface CreditCardRepository {
    suspend fun findAllCards(): List<CreditCard>
    suspend fun saveCard(info: SaveCardInfo)
    suspend fun removeCard(id: String)
    suspend fun purchaseCredits(cardId: String, credits: Double)
}