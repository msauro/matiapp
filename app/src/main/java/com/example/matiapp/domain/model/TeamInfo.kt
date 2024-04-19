package com.example.matiapp.domain.model

import com.example.matiapp.R
import dagger.Provides
import javax.inject.Inject

//data class TeamInfo @Inject constructor (
data class TeamInfo @Inject constructor (
    val name: Int,
    val years: Int,
    val img:Int
){
    companion object {
        val teams = listOf(
            TeamInfo(R.string.boca, 108, R.drawable.boca),
            TeamInfo(R.string.river, 9,R.drawable.river),
            TeamInfo(R.string.newells, 57,R.drawable.newells),
            TeamInfo(R.string.estudiantes, 26, R.drawable.estudiantes),
            TeamInfo(R.string.lanus, 29, R.drawable.lanus),
            TeamInfo(R.string.velez, 77, R.drawable.velez),
            TeamInfo(R.string.godoycruz, 13,R.drawable.godoycruz)
        )
    }
    @Provides

    public fun getTeams():List<TeamInfo>{
        return teams
    }
}


