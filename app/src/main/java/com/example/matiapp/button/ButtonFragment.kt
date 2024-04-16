package com.example.matiapp.button

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.matiapp.databinding.FragmentButtonBinding


class ButtonFragment : Fragment() {

    private var _binding: FragmentButtonBinding? = null
    private val binding get () = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentButtonBinding.inflate(layoutInflater, container, false)
        btnPressed()
        return binding.root

    }

    private fun btnPressed() {
        binding.btnButton.setOnClickListener{
            Toast.makeText(context,"APRETADO",Toast.LENGTH_SHORT).show()
        }
    }




}
