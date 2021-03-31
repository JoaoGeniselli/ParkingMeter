package com.learning.parkingmeter.commons.presentation.cards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learning.parkingmeter.R
import javax.inject.Inject

abstract class CardGridFragment : Fragment() {

    @Inject
    lateinit var adapter: CardGridAdapter

    protected var cards: List<CardGridItem> = listOf()
        set(value) {
            field = value
            adapter.updateItems(value)
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_card_grid, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        view?.findViewById<RecyclerView>(R.id.recycler)?.apply {
            this.adapter = this@CardGridFragment.adapter
            layoutManager = GridLayoutManager(context, 2)
            addItemDecoration(
                SpaceItemDecoration(
                    8
                )
            )
        }
        adapter.setOnPositionClickListener { position ->
            onCardClickedAtPosition(position)
        }

    }

    abstract fun onCardClickedAtPosition(position: Int)
}