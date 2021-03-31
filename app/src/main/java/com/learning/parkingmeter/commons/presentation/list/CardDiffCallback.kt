package com.learning.parkingmeter.commons.presentation.list

import androidx.recyclerview.widget.DiffUtil

internal class CardDiffCallback : DiffUtil.ItemCallback<CardListItem>() {

    override fun areItemsTheSame(oldItem: CardListItem, newItem: CardListItem): Boolean =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: CardListItem, newItem: CardListItem): Boolean =
        oldItem.title == newItem.title && oldItem.subtitle == newItem.subtitle

}