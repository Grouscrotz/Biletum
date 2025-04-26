package com.example.biletum

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.appbar.MaterialToolbar


class ProfileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val topAppBar = requireActivity().findViewById<androidx.coordinatorlayout.widget.CoordinatorLayout>(R.id.main_coordinator)
        val toolbar = requireActivity().findViewById<MaterialToolbar>(R.id.MainActivity_topAppBar)
        toolbar.title = "Профиль"
        toolbar.setNavigationIcon(R.drawable.ic_profile)

        return view
    }

    companion object {

    }
}