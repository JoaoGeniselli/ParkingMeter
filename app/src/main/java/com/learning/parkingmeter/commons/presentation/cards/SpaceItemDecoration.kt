package com.learning.parkingmeter.commons.presentation.cards

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.learning.parkingmeter.commons.presentation.toolbox.dipsToPixels
import java.lang.IllegalStateException

class SpaceItemDecoration(
    private val spaceInDips: Int
) : RecyclerView.ItemDecoration() {

    private var spaceInPixels: Int =
        UNINITIALIZED_PIXELS

    init {
        if (spaceInDips < 0) throw IllegalStateException("Space must be an unsigned value")
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        updatePixelsIfNeeded(parent.context)
        outRect.apply {
            bottom = spaceInPixels
            top = spaceInPixels
            left = spaceInPixels
            right = spaceInPixels
        }
    }

    private fun updatePixelsIfNeeded(context: Context) {
        if (spaceInPixels == UNINITIALIZED_PIXELS) {
            spaceInPixels = context.dipsToPixels(spaceInDips.toFloat()).toInt()
        }
    }

    companion object {
        private const val UNINITIALIZED_PIXELS = -1
    }

}