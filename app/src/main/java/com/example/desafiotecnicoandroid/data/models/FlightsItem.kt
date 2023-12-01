package com.example.desafiotecnicoandroid.data.models


import com.google.gson.annotations.SerializedName

data class FlightsItem(
    @SerializedName("id") val id: String,
    @SerializedName("arrival") val arrival: Arrival,
    @SerializedName("carrier") val carrier: String,
    @SerializedName("carrierLogoUrl") val carrierLogoUrl: String,
    @SerializedName("daysDifference") val daysDifference: Int,
    @SerializedName("departure") val departure: Departure,
    @SerializedName("duration") val duration: Int,
    @SerializedName("hasAirportChange") val hasAirportChange: Boolean,
    @SerializedName("totalStops") val totalStops: Int
) {
    data class Departure(
        @SerializedName("city") val city: String,
        @SerializedName("dateTime") val dateTime: String,
        @SerializedName("locationCode") val locationCode: String
    )

    data class Arrival(
        @SerializedName("city") val city: String,
        @SerializedName("dateTime") val dateTime: String,
        @SerializedName("locationCode") val locationCode: String
    )


}

