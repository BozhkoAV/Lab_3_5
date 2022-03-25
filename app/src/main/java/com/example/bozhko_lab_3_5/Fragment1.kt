package com.example.bozhko_lab_3_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.bozhko_lab_3_5.databinding.Fragment1Binding

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = Fragment1Binding.inflate(this.layoutInflater)
        binding.bnToSecond.setOnClickListener {
            // it.findNavController().navigate(R.id.action_nav_fragment1_to_nav_fragment2)
            it.findNavController().navigate(R.id.action_global_nav_fragment2)
        }
        return binding.root
    }
}