package com.example.matiapp.ui.teams.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.matiapp.databinding.ItemTeamBinding
import com.example.matiapp.domain.model.TeamInfo

class TeamsViewHolder(view: View) : RecyclerView.ViewHolder(view){
    private val binding = ItemTeamBinding.bind(view)

    fun render (teamInfo: TeamInfo, onItemSelected:(TeamInfo)->Unit){
        val context:Context = binding.ivTeam.context
        binding.tvTitle.text = context.getText(teamInfo.name)
        binding.ivTeam.setImageResource(teamInfo.img)
        binding.clItemTeam.setOnClickListener{onItemSelected(teamInfo)}
    }
}