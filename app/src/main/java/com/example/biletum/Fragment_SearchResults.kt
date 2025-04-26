package com.example.biletum

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.MaterialToolbar

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_SearchResults.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_SearchResults : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment__search_results, container, false)
        val topAppBar = requireActivity().findViewById<androidx.coordinatorlayout.widget.CoordinatorLayout>(R.id.main_coordinator)
        val toolbar = requireActivity().findViewById<MaterialToolbar>(R.id.MainActivity_topAppBar)
        toolbar.title = "Результаты поиска"
        toolbar.setNavigationIcon(R.drawable.ic_close)
        toolbar.setNavigationOnClickListener {
            toolbar.title = "Поиск билетов"
            requireActivity().supportFragmentManager.popBackStack()
        }

        val button = view?.findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.Search_results_container)
        button?.setOnClickListener {
            val fragment = TicketDetailsFragment()
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.MainActivity_container,fragment).addToBackStack(null).commit()
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment_SearchResults.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment_SearchResults().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}