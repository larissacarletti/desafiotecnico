package com.example.desafiotecnicoandroid.di

import com.example.desafiotecnicoandroid.api.FlightApi
import com.example.desafiotecnicoandroid.repository.FlightRepository
import com.example.desafiotecnicoandroid.utils.Constants.BASEURL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMyApi(): FlightApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASEURL)
            .build()
            .create(FlightApi::class.java)
    }

    @Provides
    @Singleton
    fun provideFlightRepository(
        api: FlightApi
    ) = FlightRepository(api)


}