package com.learning.core.data.source.city

import com.learning.core.data.source.operation.OperatingDay

data class City(
    val id: String,
    val name: String,
    val minutePrice: Double,
    val effectiveTimeByDayOfWeek: Map<OperatingDay, ClosedRange<Double>>
)