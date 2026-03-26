package com.salon.orderservice.domain

data class Order(
    val id: Int,
    val customer: String,
    val service: String,
    val status: String,
    val appointmentTime: String
)
