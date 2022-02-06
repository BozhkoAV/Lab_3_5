package com.example.bozhko_lab_3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.bozhko_lab_3_5.databinding.FragmentThirdBinding

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentThirdBinding.inflate(this.layoutInflater)
        binding.button4.setOnClickListener {
            // it.findNavController().navigate(R.id.action_nav_fragment3_to_nav_fragment1)
            it.findNavController().navigate(R.id.action_global_nav_fragment1)
        }
        binding.button5.setOnClickListener {
            // it.findNavController().navigate(R.id.action_nav_fragment3_to_nav_fragment2)
            it.findNavController().navigate(R.id.action_global_nav_fragment2)
        }
        return binding.root
    }
}