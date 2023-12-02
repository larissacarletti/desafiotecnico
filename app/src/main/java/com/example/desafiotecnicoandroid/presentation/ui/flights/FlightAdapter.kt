package com.example.desafiotecnicoandroid.presentation.ui.flights

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiotecnicoandroid.R
import com.example.desafiotecnicoandroid.data.models.FlightsItem
import com.example.desafiotecnicoandroid.databinding.ListItemBinding
import com.example.desafiotecnicoandroid.utils.formatDate
import com.example.desafiotecnicoandroid.utils.formatTime


class FlightAdapter(private val listener: FlightsFragment) :
    RecyclerView.Adapter<FlightAdapter.FlightViewHolder>() {

    var flightList: List<FlightsItem> = emptyList()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FlightViewHolder {
        return FlightViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FlightViewHolder, position: Int) {
        holder.run {
            departureInfo.text = holder.itemView.context.getString(
                R.string.iata_departure,
                flightList[position].departure.locationCode,
                flightList[position].departure.city
            )
            arrivalInfo.text = holder.itemView.context.getString(
                R.string.iata_arrival,
                flightList[position].arrival.locationCode,
                flightList[position].arrival.city
            )
            carrierInfo.text = flightList[position].carrier.capitalize()

            departureTime.text = formatTime(flightList[position].departure.dateTime)
            arrivalTime.text = formatTime(flightList[position].arrival.dateTime)

            departureDate.text = formatDate(flightList[position].departure.dateTime)
            arrivalDate.text = formatDate(flightList[position].arrival.dateTime)

            flightCard.setOnClickListener {
                listener.onItemClicked(flightList[holder.adapterPosition])
            }
        }
    }

    override fun getItemCount(): Int = flightList.size

    inner class FlightViewHolder(binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val departureInfo = binding.infoDeparture
        val arrivalInfo = binding.infoArrival
        val departureTime = binding.timeDeparture
        val arrivalTime = binding.timeArrival
        val carrierInfo = binding.carrier
        val flightCard = binding.cardFlight
        val departureDate = binding.dateDeparture
        val arrivalDate = binding.dateArrival

    }

    interface FlightClickListener {
        fun onItemClicked(flight: FlightsItem)
    }
}