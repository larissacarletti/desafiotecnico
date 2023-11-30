package com.example.desafiotecnicoandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desafiotecnicoandroid.adapter.FlightAdapter
import com.example.desafiotecnicoandroid.databinding.FragmentListBinding
import com.example.desafiotecnicoandroid.models.FlightsItem
import com.example.desafiotecnicoandroid.viewmodel.FlightViewModel


class ListFragment : Fragment(R.layout.fragment_list), FlightAdapter.FlightClickListener {

    private lateinit var binding: FragmentListBinding
    private lateinit var flightAdapter: FlightAdapter
    private lateinit var viewModel: FlightViewModel
    private lateinit var selectedFlight: FlightsItem


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[FlightViewModel::class.java]
        setUpRecyclerView()

    }

    fun setUpRecyclerView() = binding.run {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        flightAdapter = FlightAdapter()
        recyclerView.adapter = flightAdapter
    }

    override fun onItemClicked(flight: FlightsItem) {
        selectedFlight = flight
    }


}
