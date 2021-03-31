package com.learning.io.vehicles.injection

import com.learning.core.data.source.vehicles.VehiclesRepository
import com.learning.io.vehicles.MemoryVehiclesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(ActivityComponent::class, FragmentComponent::class)
abstract class IOModule {

    @Binds
    abstract fun bindVehiclesRepository(presenter: MemoryVehiclesRepository) : VehiclesRepository
}