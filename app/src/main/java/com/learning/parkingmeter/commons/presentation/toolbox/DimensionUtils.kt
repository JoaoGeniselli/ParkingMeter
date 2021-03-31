package com.learning.parkingmeter.commons.presentation.toolbox

import android.content.Context
import android.util.DisplayMetrics
import android.util.TypedValue

fun Context.dipsToPixels(dips: Float): Float {
    val metrics: DisplayMetrics = resources.displayMetrics
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dips, metrics)
}