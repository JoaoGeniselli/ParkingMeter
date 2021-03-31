package com.learning.parkingmeter.commons.presentation.cards

import androidx.annotation.DrawableRes

data class CardGridItem(
    @DrawableRes val icon: Int,
    val title: CharSequence
)