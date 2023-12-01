package com.example.desafiotecnicoandroid.data.api

import com.example.desafiotecnicoandroid.data.models.FlightsItem
import retrofit2.Response
import retrofit2.http.GET

interface FlightApi {

    @GET("test-mobile-flights-list.json")
    suspend fun getFlightList(): Response<List<FlightsItem>>



}