package com.learning.parkingmeter.injection

import androidx.fragment.app.Fragment
import com.learning.parkingmeter.features.FeaturesContract
import com.learning.parkingmeter.features.FeaturesFragment
import com.learning.parkingmeter.vehicles.VehiclesContract
import com.learning.parkingmeter.vehicles.VehiclesFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(ActivityComponent::class, FragmentComponent::class)
class ViewsModule {

    @Provides
    fun bindFeaturesFragment(fragment: Fragment): FeaturesContract.View {
        return fragment as FeaturesFragment
    }

    @Provides
    fun bindVehiclesFragment(fragment: Fragment): VehiclesContract.View {
        return fragment as VehiclesFragment
    }
}