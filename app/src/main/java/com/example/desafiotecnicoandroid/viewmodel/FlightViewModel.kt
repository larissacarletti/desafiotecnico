package com.example.desafiotecnicoandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.desafiotecnicoandroid.models.FlightsItem
import com.example.desafiotecnicoandroid.repository.FlightRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FlightViewModel @Inject constructor(repository: FlightRepository) : ViewModel() {

    private val _flights = MutableLiveData<FlightsItem>()
    val flight: LiveData<FlightsItem> =_flights

    init {
        viewModelScope.launch(Dispatchers.IO) {
            _flights.postValue(repository.getFlights())
        }
    }

}