package com.example.desafiotecnicoandroid.data.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FlightsItem(
    @SerializedName("id") val id: String,
    @SerializedName("arrival") val arrival: Arrival,
    @SerializedName("carrier") val carrier: String,
    @SerializedName("carrierLogoUrl") val carrierLogoUrl: String,
    @SerializedName("daysDifference") val daysDifference: Int,
    @SerializedName("departure") val departure: Departure,
    @SerializedName("duration") val duration: Int,
    @SerializedName("hasAirportChange") val hasAirportChange: Boolean,
    @SerializedName("totalStops") var totalStops: Int
) : Parcelable {

    @Parcelize
    data class Departure(
        @SerializedName("city") val city: String,
        @SerializedName("dateTime") val dateTime: String,
        @SerializedName("locationCode") val locationCode: String
    ) : Parcelable

    @Parcelize
    data class Arrival(
        @SerializedName("city") val city: String,
        @SerializedName("dateTime") val dateTime: String,
        @SerializedName("locationCode") val locationCode: String
    ) : Parcelable
}

