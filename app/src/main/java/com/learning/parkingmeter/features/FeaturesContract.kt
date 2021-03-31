package com.learning.parkingmeter.features

import com.learning.parkingmeter.commons.presentation.cards.CardGridItem

object FeaturesContract {

    interface View {
        fun showFeatures(cards: List<CardGridItem>)
        fun redirectToVehiclesManagement()
    }

    interface Presenter {
        fun init()
        fun onFeatureClickedAtPosition(position: Int)
    }
}