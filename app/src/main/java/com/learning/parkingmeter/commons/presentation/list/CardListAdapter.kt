package com.learning.parkingmeter.commons.presentation.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.learning.parkingmeter.R
import javax.inject.Inject

class CardListAdapter @Inject constructor() :
    ListAdapter<CardListItem, CardListAdapter.ViewHolder>(CardDiffCallback()) {

    private var actionClickListener: (Int) -> Unit = {}
    private var positionClickListener: (Int) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card_list, parent, false)
            .run { ViewHolder(this) }

    fun setOnPositionClickListener(listener: (Int) -> Unit) {
        this.positionClickListener = listener
    }

    fun setonActionClickListener(listener: (Int) -> Unit) {
        this.actionClickListener = listener
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position).run {
            holder.setup(title, subtitle, action, positionClickListener, actionClickListener)
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun setup(
            title: String,
            subtitle: String,
            action: Int?, positionListener: (Int) -> Unit,
            actionListener: (Int) -> Unit
        ) {
            itemView.findViewById<TextView>(R.id.title)?.text = title
            itemView.findViewById<TextView>(R.id.subtitle)?.text = subtitle
            if (action != null) {
                itemView.findViewById<ImageButton>(R.id.action_icon)?.apply {
                    setImageResource(action)
                    visibility = View.VISIBLE
                    setOnClickListener { actionListener(layoutPosition) }
                }
            } else {
                itemView.findViewById<ImageButton>(R.id.action_icon)?.apply {
                    visibility = View.GONE
                }
            }
            itemView.setOnClickListener { positionListener(layoutPosition) }
        }
    }
}