package com.yusnaa.isaku

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.yusnaa.isaku.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    private lateinit var binding: FragmentDashboardBinding
    private lateinit var topUpButtonMandiri: Button
    private lateinit var topUpButtonJago: Button
    private lateinit var topUpButtonBRI: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDashboardBinding.bind(view)

        topUpButtonMandiri = binding.btnTopUpMandiri
        topUpButtonMandiri.setOnClickListener {
            val intent = Intent(requireContext(), TopUpActivity::class.java)
            startActivity(intent)
        }

        topUpButtonJago = binding.btnTopUpJago
        topUpButtonJago.setOnClickListener {
            val intent = Intent(requireContext(), TopUpActivity::class.java)
            startActivity(intent)
        }

        topUpButtonBRI = binding.btnTopUpBRI
        topUpButtonBRI.setOnClickListener {
            val intent = Intent(requireContext(), TopUpActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    companion object {
        const val EXTRA_USERNAME = "extra_username"
    }
}