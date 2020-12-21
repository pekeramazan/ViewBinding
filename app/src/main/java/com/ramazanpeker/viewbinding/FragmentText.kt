package com.ramazanpeker.viewbinding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ramazanpeker.viewbinding.databinding.FragmentTextBinding

class FragmentText: Fragment(R.layout.fragment_text) {
    private lateinit var binding: FragmentTextBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentTextBinding.bind(view)
        binding.tvtext
    }
}