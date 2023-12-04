package com.presentation.viewmodel

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.data.repository.FakeFlightRepository
import com.example.desafiotecnicoandroid.data.models.FlightsItem
import com.example.desafiotecnicoandroid.presentation.ui.viewmodel.FlightViewModel
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FlightViewModelTest {

    private lateinit var flightViewModel : FlightViewModel

    @Before
    fun setUp() {
        val fakeFlightRepository = FakeFlightRepository()
        flightViewModel = FlightViewModel(fakeFlightRepository)
    }

    fun getFlight_returnsCurrentFlight() {
        val flight = mutableListOf(FlightsItem(id = "1",
        arrival = FlightsItem.Arrival("Rio de Janeiro", "7:00", "GIG"),
        carrier = "carrier",
        carrierLogoUrl = "logoUrl",
        daysDifference = 0,
        departure = FlightsItem.Departure("São Paulo", "8:00", "CGH"),
        duration = 1000,
        hasAirportChange = false,
        totalStops = 0))
        val currentFlight = flightViewModel.flight
        assertThat(currentFlight).isEqualTo(flight)
    }

}