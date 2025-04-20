package com.aristidevs.horoscapp.domain

import com.aristidevs.horoscapp.data.network.response.PredictionResponse


interface Repository {
    suspend fun getPrediction(sign: String): PredictionResponse?
}
