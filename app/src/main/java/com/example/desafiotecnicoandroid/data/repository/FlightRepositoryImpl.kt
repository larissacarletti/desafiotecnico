package com.example.desafiotecnicoandroid.data.repository

import com.example.desafiotecnicoandroid.data.api.FlightApi
import com.example.desafiotecnicoandroid.data.models.FlightsItem
import com.example.desafiotecnicoandroid.domain.repository.FlightRepository
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class FlightRepositoryImpl @Inject constructor(private val api: FlightApi) : FlightRepository {

    override suspend fun getFlights(): List<FlightsItem>? {
        return api.getFlightList().body()
    }
}