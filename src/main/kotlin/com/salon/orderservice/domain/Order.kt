package com.salon.orderservice.domain

// order model
data class Order(
    val id: Int,
    val customer: String,
    val service: String,
    val status: String? = null,
    val appointmentTime: String
)
