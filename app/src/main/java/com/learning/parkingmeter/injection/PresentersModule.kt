package com.learning.parkingmeter.injection

import com.learning.parkingmeter.features.FeaturesContract
import com.learning.parkingmeter.features.FeaturesPresenter
import com.learning.parkingmeter.vehicles.VehiclesContract
import com.learning.parkingmeter.vehicles.VehiclesPresenter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(ActivityComponent::class, FragmentComponent::class)
abstract class PresentersModule {

    @Binds
    abstract fun bindFeaturesPresenter(presenter: FeaturesPresenter) : FeaturesContract.Presenter

    @Binds
    abstract fun bindVehiclesPresenter(presenter: VehiclesPresenter) : VehiclesContract.Presenter
}