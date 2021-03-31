package com.learning.parkingmeter.vehicles

import android.os.Bundle
import com.learning.parkingmeter.commons.presentation.list.CardListFragment
import com.learning.parkingmeter.commons.presentation.list.CardListItem
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class VehiclesFragment : CardListFragment(), VehiclesContract.View {

    @Inject
    lateinit var presenter: VehiclesContract.Presenter

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.init()
    }

    override fun onCardClickedAtPosition(position: Int) {

    }

    override fun showVehicles(vehicles: List<CardListItem>) {
        cards = vehicles
    }

    override fun startLoading() {

    }

    override fun stopLoading() {

    }


}