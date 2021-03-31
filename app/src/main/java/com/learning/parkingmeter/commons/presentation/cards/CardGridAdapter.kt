package com.learning.parkingmeter.commons.presentation.cards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.learning.parkingmeter.R
import com.learning.parkingmeter.commons.presentation.LoadingView
import javax.inject.Inject

class CardGridAdapter @Inject constructor() :
    RecyclerView.Adapter<CardGridAdapter.ViewHolder>(), LoadingView {

    private var listener: (Int) -> Unit = {}
    private var cards: List<CardGridItem> = listOf()

    fun updateItems(cards: List<CardGridItem>) {
        this.cards = cards
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card_grid, parent, false)
            .run {
                ViewHolder(
                    this
                )
            }

    override fun getItemCount(): Int = cards.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        cards[position].run { holder.setup(icon, title, listener) }
    }

    fun setOnPositionClickListener(listener: (Int) -> Unit) {
        this.listener = listener
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val iconView: ImageView? get() = itemView.findViewById(R.id.icon)
        private val titleView: TextView? get() = itemView.findViewById(R.id.title)

        fun setup(icon: Int, title: CharSequence, listener: (Int) -> Unit) {
            iconView?.setImageResource(icon)
            titleView?.text = title
            itemView.setOnClickListener { listener(layoutPosition) }
        }
    }

    override fun startLoading() {
        // TODO: ADD SHIMMERS HERE
    }

    override fun stopLoading() {
        // TODO: REMOVE SHIMMERS HERE
    }
}