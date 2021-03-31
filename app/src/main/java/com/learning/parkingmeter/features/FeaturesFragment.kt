package com.learning.parkingmeter.features

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.learning.parkingmeter.R
import com.learning.parkingmeter.commons.presentation.cards.CardGridFragment
import com.learning.parkingmeter.commons.presentation.cards.CardGridItem
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeaturesFragment : CardGridFragment(), FeaturesContract.View {

    @Inject
    lateinit var presenter: FeaturesContract.Presenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.init()
    }

    override fun onCardClickedAtPosition(position: Int) =
        presenter.onFeatureClickedAtPosition(position)

    override fun showFeatures(cards: List<CardGridItem>) {
        this.cards = cards
    }

    override fun redirectToVehiclesManagement() {
        view?.findNavController()?.navigate(R.id.vehiclesFragment)
    }
}