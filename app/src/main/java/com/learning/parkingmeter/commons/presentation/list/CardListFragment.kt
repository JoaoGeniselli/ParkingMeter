package com.learning.parkingmeter.commons.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learning.parkingmeter.R
import com.learning.parkingmeter.commons.presentation.LoadingView
import com.learning.parkingmeter.commons.presentation.cards.SpaceItemDecoration
import javax.inject.Inject

abstract class CardListFragment : Fragment(), LoadingView {

    @Inject
    lateinit var adapter: CardListAdapter

    protected var cards: List<CardListItem> = listOf()
        set(value) {
            field = value
            adapter.submitList(value)
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_card_list, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        view?.findViewById<RecyclerView>(R.id.recycler)?.apply {
            this.adapter = this@CardListFragment.adapter
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(SpaceItemDecoration(8))
        }
        adapter.setOnPositionClickListener { position ->
            onCardClickedAtPosition(position)
        }
        adapter.setonActionClickListener { position ->
            onCardClickedAtPosition(position)
        }
    }

    abstract fun onCardClickedAtPosition(position: Int)

    open fun onCardActionClickedAtPosition(position: Int) = Unit

    override fun startLoading() {
        // TODO: ADD SHIMMERS HERE
    }

    override fun stopLoading() {
        // TODO: REMOVE SHIMMERS HERE
    }
}