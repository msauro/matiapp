package com.example.matiapp.ui.teams

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.matiapp.data.providers.TeamsProvider
import com.example.matiapp.domain.model.TeamInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class TeamsViewModel @Inject constructor(teamsProvider: TeamsProvider):ViewModel() {

    private var _teams = MutableStateFlow<List<TeamInfo>>(emptyList())
    val teams: StateFlow<List<TeamInfo>> = _teams

    init {
        _teams.value = teamsProvider.getTeams()
    }




}