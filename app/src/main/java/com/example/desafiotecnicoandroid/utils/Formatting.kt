package com.example.desafiotecnicoandroid.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun formatTime(stringTime: String): String {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)
    inputFormat.timeZone = TimeZone.getTimeZone("America/Sao_Paulo")
    val time: Date = inputFormat.parse(stringTime)

    val outputFormat = SimpleDateFormat("HH:mm", Locale.US)
    outputFormat.timeZone = TimeZone.getTimeZone("America/Sao_Paulo")
    return outputFormat.format(time)
}

fun formatDate(stringDate: String): String {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)
    inputFormat.timeZone = TimeZone.getTimeZone("America/Sao_Paulo")
    val date: Date? = inputFormat.parse(stringDate)

    val outputFormat = SimpleDateFormat("dd/MM/yy", Locale.US)
    outputFormat.timeZone = TimeZone.getTimeZone("America/Sao_Paulo")
    return outputFormat.format(date)
}

fun formatDuration(stringDuration: Int): String {

    val hours = stringDuration.div(3600)
    val rest = stringDuration % 3600
    val minutes = rest.div(60)

    return if (hours <= 1) {
        "$hours hora e $minutes minutos"
    } else {
        "$hours horas e $minutes minutos"
    }
}

fun formatStops(stringStop: Int): String {

    val stops = if (stringStop == 0) {
        return "Nenhuma parada."
    } else {
        "$stringStop paradas"
    }
    return stops
}
