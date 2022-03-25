package com.example.bozhko_lab_3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.bozhko_lab_3_5.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = Fragment2Binding.inflate(this.layoutInflater)
        binding.bnToFirst.setOnClickListener {
            // it.findNavController().navigate(R.id.action_nav_fragment2_to_nav_fragment1)
            it.findNavController().navigate(R.id.action_global_nav_fragment1)
        }
        binding.bnToThird.setOnClickListener {
            it.findNavController().navigate(R.id.action_nav_fragment2_to_nav_fragment3)
        }
        return binding.root
    }
}