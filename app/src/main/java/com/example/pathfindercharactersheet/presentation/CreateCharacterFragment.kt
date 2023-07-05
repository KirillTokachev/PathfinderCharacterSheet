package com.example.pathfindercharactersheet.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pathfindercharactersheet.R
import com.example.pathfindercharactersheet.databinding.FragmentCreateCharacterBinding

class CreateCharacterFragment : Fragment() {
    private var _binding: FragmentCreateCharacterBinding? = null
    private val binding get() = _binding ?: throw NullPointerException("FragmentCreateCharacterBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }
}