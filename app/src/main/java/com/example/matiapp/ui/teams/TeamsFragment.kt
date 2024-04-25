package com.example.matiapp.ui.teams

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.matiapp.databinding.FragmentTeamsBinding
import com.example.matiapp.domain.model.TeamInfo
import com.example.matiapp.ui.teams.adapter.TeamsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TeamsFragment : Fragment() {

    private val teamsViewModel by viewModels<TeamsViewModel>()
    private lateinit var teamsAdapter: TeamsAdapter

    private var _binding: FragmentTeamsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }

    private fun initList(){
        teamsAdapter = TeamsAdapter(onItemSelected={
            teamSelected(it)
            findNavController().navigate(
                TeamsFragmentDirections.actionTeamsFragmentToTeamDetailActivity(it.name)
            )
        })
        binding.rvTeams.apply{
            layoutManager = GridLayoutManager(context,2)
             adapter = teamsAdapter
        }
    }

    private fun teamSelected(it: TeamInfo) {
        Toast.makeText(context,it.category.toString(),Toast.LENGTH_SHORT).show()
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                teamsViewModel.teams.collect{
                    teamsAdapter.updateList(it)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentTeamsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}