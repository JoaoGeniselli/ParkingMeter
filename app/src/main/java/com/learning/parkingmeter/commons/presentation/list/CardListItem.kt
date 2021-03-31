package com.learning.parkingmeter.commons.presentation.list

import androidx.annotation.DrawableRes

data class CardListItem(
    val title: String,
    val subtitle: String,
    @DrawableRes val action: Int? = null
)