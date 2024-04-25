package com.example.matiapp.domain.model

import com.example.matiapp.R

//data class TeamInfo @Inject constructor (
data class TeamInfo (
    val name: Int,
    val years: Int,
    val img:Int,
    val category:Int
){
    companion object {
        val teams = listOf(
            TeamInfo(R.string.boca, 108, R.drawable.boca,0),
            TeamInfo(R.string.river, 9,R.drawable.river,1),
            TeamInfo(R.string.newells, 57,R.drawable.newells,1),
            TeamInfo(R.string.estudiantes, 26, R.drawable.estudiantes,2),
            TeamInfo(R.string.lanus, 29, R.drawable.lanus,6),
            TeamInfo(R.string.velez, 77, R.drawable.velez,1),
            TeamInfo(R.string.godoycruz, 13,R.drawable.godoycruz,1)
        )
    }

//    public fun getTeams():List<TeamInfo>{
//        return teams
//    }
}


