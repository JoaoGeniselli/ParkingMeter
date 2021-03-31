package com.learning.parkingmeter.features

import com.learning.parkingmeter.commons.presentation.cards.CardGridItem
import com.learning.parkingmeter.R
import javax.inject.Inject

class FeaturesPresenter @Inject constructor(
    private val view: FeaturesContract.View
) : FeaturesContract.Presenter {

    override fun init() {
        val features = listOf(
            CardGridItem(
                R.drawable.ic_baseline_local_parking_24,
                "Zona Azul"
            ),
            CardGridItem(
                R.drawable.ic_baseline_directions_car_24,
                "Veículos"
            ),
            CardGridItem(
                R.drawable.ic_baseline_credit_card_24,
                "Formas de Pagamento"
            ),
            CardGridItem(
                R.drawable.ic_baseline_attach_money_24,
                "Comprar Créditos"
            ),
            CardGridItem(
                R.drawable.ic_baseline_person_24,
                "Perfil"
            ),
            CardGridItem(
                R.drawable.ic_baseline_settings_24,
                "Configurações"
            )
        )
        view.showFeatures(features)
    }

    override fun onFeatureClickedAtPosition(position: Int) {
        view.redirectToVehiclesManagement()
    }
}
