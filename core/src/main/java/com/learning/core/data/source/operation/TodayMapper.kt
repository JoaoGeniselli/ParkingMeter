package com.learning.core.data.source.operation

import com.learning.core.data.source.operation.OperatingDay
import java.util.*

interface TodayMapper {
    suspend fun convertTodayToOperatingDay(today: Date): OperatingDay?
}