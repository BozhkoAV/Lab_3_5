package com.example.bozhko_lab_3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.bozhko_lab_3_5.databinding.Fragment3Binding

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = Fragment3Binding.inflate(this.layoutInflater)
        binding.bnToFirst.setOnClickListener {
            // it.findNavController().navigate(R.id.action_nav_fragment3_to_nav_fragment1)
            it.findNavController().navigate(R.id.action_global_nav_fragment1)
        }
        binding.bnToSecond.setOnClickListener {
            // it.findNavController().navigate(R.id.action_nav_fragment3_to_nav_fragment2)
            it.findNavController().navigate(R.id.action_global_nav_fragment2)
        }
        return binding.root
    }
}