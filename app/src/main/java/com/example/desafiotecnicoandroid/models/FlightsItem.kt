package com.example.desafiotecnicoandroid.models


import com.google.gson.annotations.SerializedName

data class FlightsItem(
    @SerializedName("arrival")
    val arrival: Arrival,
    @SerializedName("carrier")
    val carrier: String,
    @SerializedName("carrierLogoUrl")
    val carrierLogoUrl: String,
    @SerializedName("daysDifference")
    val daysDifference: Int,
    @SerializedName("departure")
    val departure: Departure,
    @SerializedName("duration")
    val duration: Int,
    @SerializedName("hasAirportChange")
    val hasAirportChange: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("totalStops")
    val totalStops: Int
)