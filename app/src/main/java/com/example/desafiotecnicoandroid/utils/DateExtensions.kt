package com.example.desafiotecnicoandroid.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun formatDate(stringDate: String): String {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)
    inputFormat.timeZone = TimeZone.getTimeZone("America/Sao_Paulo")
    val date: Date = inputFormat.parse(stringDate)

    val outputFormat = SimpleDateFormat("HH:mm", Locale.US)
    outputFormat.timeZone = TimeZone.getTimeZone("America/Sao_Paulo")
    return outputFormat.format(date)
}