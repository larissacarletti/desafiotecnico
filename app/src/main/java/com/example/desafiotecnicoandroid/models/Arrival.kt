package com.example.desafiotecnicoandroid.models


import com.google.gson.annotations.SerializedName

data class Arrival(
    @SerializedName("city")
    val city: String,
    @SerializedName("dateTime")
    val dateTime: String,
    @SerializedName("locationCode")
    val locationCode: String
)