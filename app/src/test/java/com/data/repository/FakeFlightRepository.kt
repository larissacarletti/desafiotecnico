package com.data.repository

import com.example.desafiotecnicoandroid.data.models.FlightsItem
import com.example.desafiotecnicoandroid.domain.repository.FlightRepository

class FakeFlightRepository : FlightRepository {

    private val flight = mutableListOf<FlightsItem>()

    init {
        flight.add(
            FlightsItem(
                id = "1",
                arrival = FlightsItem.Arrival("Rio de Janeiro", "7:00", "GIG"),
                carrier = "carrier",
                carrierLogoUrl = "logoUrl",
                daysDifference = 0,
                departure = FlightsItem.Departure("São Paulo", "8:00", "CGH"),
                duration = 1000,
                hasAirportChange = false,
                totalStops = 0
            )

        )
    }

    override suspend fun getFlights(): List<FlightsItem>? {
        return flight
    }
}