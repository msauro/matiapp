package com.example.matiapp.data.providers

import com.example.matiapp.domain.model.TeamInfo
import javax.inject.Inject

class TeamsProvider @Inject constructor(private val teamInfo: TeamInfo) {
    fun getTeams(): List<TeamInfo>{
       return teamInfo.getTeams()
    }
}