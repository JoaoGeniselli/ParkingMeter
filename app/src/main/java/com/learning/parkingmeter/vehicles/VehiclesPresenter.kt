package com.learning.parkingmeter.vehicles

import com.learning.core.data.source.vehicles.Vehicle
import com.learning.core.data.source.vehicles.VehiclesRepository
import com.learning.parkingmeter.R
import com.learning.parkingmeter.commons.presentation.list.CardListItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class VehiclesPresenter @Inject constructor(
    private val view: VehiclesContract.View,
    private val repository: VehiclesRepository
) : VehiclesContract.Presenter, CoroutineScope {

    override val coroutineContext: CoroutineContext = Dispatchers.IO

    override fun init() {
        launch {
            val vehicles = repository.findAllCars().map { it.toCard() }

            withContext(Dispatchers.Main) {
                view.showVehicles(vehicles)
            }
        }
    }

    private fun Vehicle.toCard() =
        CardListItem(description, plate, R.drawable.ic_baseline_delete_24)
}