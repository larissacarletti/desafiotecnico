package com.example.desafiotecnicoandroid.presentation.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.desafiotecnicoandroid.R
import com.example.desafiotecnicoandroid.data.models.FlightsItem
import com.example.desafiotecnicoandroid.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment(R.layout.fragment_details) {

    private lateinit var binding : FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun setFlightInformation(flight: FlightsItem) = binding.run {
        carrierDetails.text = flight.carrier
        detailsDeparture.text = getString(
            R.string.iata_departure,
            flight.departure.locationCode,
            flight.departure.city)
        detailsArrival.text = getString(
            R.string.iata_arrival,
            flight.arrival.locationCode,
            flight.arrival.city)

    }

}
