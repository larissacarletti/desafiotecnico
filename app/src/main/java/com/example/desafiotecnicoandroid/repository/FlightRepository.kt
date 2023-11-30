package com.example.desafiotecnicoandroid.repository

import com.example.desafiotecnicoandroid.api.FlightApi
import com.example.desafiotecnicoandroid.models.FlightsItem
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class FlightRepository @Inject constructor( private val api: FlightApi) {

    suspend fun getFlights(): FlightsItem? {
        return api.getFlightList().body()
    }

}