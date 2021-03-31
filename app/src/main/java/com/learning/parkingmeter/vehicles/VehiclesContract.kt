package com.learning.parkingmeter.vehicles

import com.learning.parkingmeter.commons.presentation.LoadingView
import com.learning.parkingmeter.commons.presentation.list.CardListItem

object VehiclesContract {

    interface View : LoadingView {
        fun showVehicles(vehicles: List<CardListItem>)
    }

    interface Presenter {
        fun init()
    }
}