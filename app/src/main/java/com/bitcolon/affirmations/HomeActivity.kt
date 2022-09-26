package com.bitcolon.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.bitcolon.affirmations.adapter.ItemAdapter
import com.bitcolon.affirmations.data.Datasource


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val dataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.rvQuotes)
        recyclerView.adapter = ItemAdapter(this, dataset)
        recyclerView.setHasFixedSize(true)
        // RecyclerView Horizontal
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.scrollIndicators = RecyclerView.SCROLL_INDICATOR_LEFT or RecyclerView.SCROLL_INDICATOR_RIGHT
        val helper: SnapHelper = LinearSnapHelper()
        helper.attachToRecyclerView(recyclerView)
    }
}