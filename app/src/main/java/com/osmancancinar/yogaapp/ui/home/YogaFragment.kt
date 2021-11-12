package com.osmancancinar.yogaapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.osmancancinar.yogaapp.databinding.FragmentYogaBinding
import com.osmancancinar.yogaapp.vm.home.YogaVM

class YogaFragment : Fragment() {

    private lateinit var binding: FragmentYogaBinding
    private lateinit var viewModel: YogaVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYogaBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(YogaVM::class.java)
    }
}