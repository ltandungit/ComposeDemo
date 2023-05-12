package com.example.composedemo.data

data class City(
    val name: String,
    val country: String,
    val latitude: String,
    val longitude: String
) {
    val nameDisplay = "$name $country"
}

data class ExploreModel(
    val city: City,
    val description: String,
    val imageUrl: String
)