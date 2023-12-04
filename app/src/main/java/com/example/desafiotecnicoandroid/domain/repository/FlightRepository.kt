package com.example.desafiotecnicoandroid.domain.repository

import com.example.desafiotecnicoandroid.data.models.FlightsItem

interface FlightRepository {
    suspend fun getFlights(): List<FlightsItem>?
}