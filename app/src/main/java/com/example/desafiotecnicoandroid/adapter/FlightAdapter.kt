package com.example.desafiotecnicoandroid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiotecnicoandroid.ListFragment
import com.example.desafiotecnicoandroid.databinding.ListItemBinding
import com.example.desafiotecnicoandroid.models.FlightsItem

class FlightAdapter() : RecyclerView.Adapter<FlightAdapter.FlightViewHolder>() {

    private var flightList = ArrayList<FlightsItem>()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FlightAdapter.FlightViewHolder {
        return FlightViewHolder(ListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: FlightAdapter.FlightViewHolder, position: Int) {
        holder.run {
            departureInfo.text = flightList[position].departure.locationCode
            arrivalInfo.text = flightList[position].arrival.locationCode
            departureTime.text = flightList[position].departure.dateTime
            arrivalTime.text = flightList[position].arrival.dateTime
            carrierInfo.text = flightList[position].carrier

        }
    }

    override fun getItemCount(): Int = flightList.size

    inner class FlightViewHolder(binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val departureInfo = binding.infoDeparture
        val arrivalInfo = binding.infoArrival
        val departureTime = binding.timeDeparture
        val arrivalTime = binding.timeArrival
        val carrierInfo = binding.carrier

    }

    interface FlightClickListener {
        fun onItemClicked(flight: FlightsItem)
    }


}