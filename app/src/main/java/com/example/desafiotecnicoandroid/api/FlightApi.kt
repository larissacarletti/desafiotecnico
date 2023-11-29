package com.example.desafiotecnicoandroid.api

import com.example.desafiotecnicoandroid.models.Flights
import retrofit2.Response
import retrofit2.http.GET

interface FlightApi {

    @GET("test-mobile-flights-list.json")
    suspend fun getFlightList(): Response<Flights>



}