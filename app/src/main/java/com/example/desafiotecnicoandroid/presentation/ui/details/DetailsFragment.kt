package com.example.desafiotecnicoandroid.presentation.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.desafiotecnicoandroid.R
import com.example.desafiotecnicoandroid.data.models.FlightsItem
import com.example.desafiotecnicoandroid.databinding.FragmentDetailsBinding
import com.example.desafiotecnicoandroid.utils.formatDate

class DetailsFragment : Fragment(R.layout.fragment_details) {

    private lateinit var binding: FragmentDetailsBinding
    private val args: DetailsFragmentArgs by navArgs()
    private lateinit var flight: FlightsItem

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFlightInformation()
        setUpToolbar()

    }

    private fun setFlightInformation() = binding.run {
        flight = args.flight
        carrierDetails.text = flight.carrier.capitalize()
        detailsDeparture.text = getString(
            R.string.iata_departure,
            flight.departure.locationCode,
            flight.departure.city
        )
        detailsArrival.text = getString(
            R.string.iata_arrival,
            flight.arrival.locationCode,
            flight.arrival.city
        )
        timeDepartureDetails.text = formatDate(flight.departure.dateTime)
        timeArrivalDetails.text = formatDate(flight.arrival.dateTime)
    }

    private fun setUpToolbar() = binding.run {
        toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
    }
}
