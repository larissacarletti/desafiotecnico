package com.example.desafiotecnicoandroid.presentation.ui.flights

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafiotecnicoandroid.R
import com.example.desafiotecnicoandroid.databinding.FragmentListBinding
import com.example.desafiotecnicoandroid.data.models.FlightsItem
import com.example.desafiotecnicoandroid.presentation.ui.viewmodel.FlightViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FlightsFragment : Fragment(R.layout.fragment_list), FlightAdapter.FlightClickListener {

    private lateinit var binding: FragmentListBinding
    private lateinit var flightAdapter: FlightAdapter
    private val viewModel: FlightViewModel by viewModels()
    private lateinit var selectedFlight: FlightsItem

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()

    }

    private fun setUpRecyclerView() = binding.run {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        flightAdapter = FlightAdapter()
        recyclerView.adapter = flightAdapter
        viewModel.flight.observe(viewLifecycleOwner) {
            flightAdapter.flightList = it
            flightAdapter.notifyDataSetChanged()
        }
    }

    override fun onItemClicked(flight: FlightsItem) {
        selectedFlight = flight
        val action = FlightsFragmentDirections.actionFlightsFragmentToDetailsFragment(flight)
        findNavController().navigate(action)
    }
}
