package com.example.desafiotecnicoandroid.data.repository

import com.example.desafiotecnicoandroid.data.api.FlightApi
import com.example.desafiotecnicoandroid.data.models.FlightsItem
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class FlightRepository @Inject constructor(private val api: FlightApi) {

    suspend fun getFlights(): List<FlightsItem>? {
        return api.getFlightList().body()
    }
}