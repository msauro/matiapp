package com.example.matiapp.ui.positions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.matiapp.databinding.FragmentPositionsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PositionsFragment : Fragment() {

    //private val listViewModel by viewModels<HeroViewModel> () //instancio el VM
    //private lateinit var adapter:HeroAdapter

    private var _binding: FragmentPositionsBinding? = null
    private val binding get () = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPositionsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
        initUI()
    }

    private fun initList() {
      //  adapter = HeroAdapter(onItemSelected = {Toast.makeText(context, getString(it.name), Toast.LENGTH_SHORT).show()})
      //  binding.rvHeroes.layoutManager= LinearLayoutManager(context)
//binding.rvHeroes.adapter = adapter

    }

    private fun initUI() {
        //initUIState()
    }

//    private fun initUIState() {
//        lifecycleScope.launch {
//            repeatOnLifecycle(Lifecycle.State.STARTED){
//                listViewModel.heroes.collect{
//                    listViewModel.heroes.collect{
//                        adapter.updateList(it)
//                    }
//                }
//            }
//        }
//    }

}


