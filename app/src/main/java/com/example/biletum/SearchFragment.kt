package com.example.biletum

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.appbar.MaterialToolbar


class SearchFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search, container, false)


        val button = view?.findViewById<Button>(R.id.FragmentSearch_button_search)
        button?.setOnClickListener {
            val fragment = Fragment_SearchResults()
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.MainActivity_container,fragment).addToBackStack(null).commit()
        }
        return view
    }

    companion object {

    }
}