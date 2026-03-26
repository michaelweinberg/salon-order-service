package com.salon.orderservice.domain

data class CreateOrderResponse(
    val status: Int,
    val message: String,
    val order: Order
)
