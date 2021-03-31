package com.learning.core.data.source.payment

data class SaveCardInfo(
    val number: String,
    val owner: String,
    val expirationMonth: Int,
    val expirationYear: Int,
    val verificationCode: Int
)