package com.example.biletum

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.appbar.MaterialToolbar


class TicketDetailsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_ticket_details, container, false)

        val topAppBar = requireActivity().findViewById<androidx.coordinatorlayout.widget.CoordinatorLayout>(R.id.main_coordinator)
        val toolbar = requireActivity().findViewById<MaterialToolbar>(R.id.MainActivity_topAppBar)
        toolbar.title = "Детали билета"

        return view
    }

    companion object {

    }
}