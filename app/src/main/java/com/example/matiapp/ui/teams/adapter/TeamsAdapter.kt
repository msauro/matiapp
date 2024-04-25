package com.example.matiapp.ui.teams.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.matiapp.R
import com.example.matiapp.domain.model.TeamInfo

class TeamsAdapter(private var teamList:List<TeamInfo> = emptyList(), private val onItemSelected:(TeamInfo)->Unit):
    RecyclerView.Adapter<TeamsViewHolder>() {

    fun updateList(list:List<TeamInfo>){
        orderList(list)
        notifyDataSetChanged()
    }

    private fun orderList(list: List<TeamInfo>) {

        teamList = list.sortedByDescending { it.years }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamsViewHolder {
        //crea la instancia del viewHolder
        return TeamsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_team ,parent,false)
        )
    }

    override fun getItemCount()= teamList.size

    override fun onBindViewHolder(holder: TeamsViewHolder, position: Int) {
        holder.render(teamList[position], onItemSelected)
    }


}