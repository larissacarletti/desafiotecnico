package com.example.desafiotecnicoandroid.models


import com.google.gson.annotations.SerializedName

data class Departure(
    @SerializedName("city")
    val city: String,
    @SerializedName("dateTime")
    val dateTime: String,
    @SerializedName("locationCode")
    val locationCode: String
)