package com.example.preodabitcoin
import okhttp3.*

class HttpBitcoin {

    private val client = OkHttpClient()

    fun getBitcoinPrice(){

        var request = Request.Builder()
            .url("https://api.coingecko.com/api/v3/coins/bitcoin")
            .method("GET", null)
            .build()

        var response = client.newCall(request).execute()

        if(response.isSuccessful){

        }

    }

 }