package com.example.matiapp.data.providers

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.matiapp.domain.model.TeamInfo
import javax.inject.Inject


class TeamsProvider @Inject constructor() {
    fun getTeams(): List<TeamInfo>{
        Log.i("ÑU", TeamInfo.teams.toString())
       return TeamInfo.teams
    }
}