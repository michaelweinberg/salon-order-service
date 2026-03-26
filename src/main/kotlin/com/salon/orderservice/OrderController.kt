package com.salon.orderservice

import com.salon.orderservice.domain.Order
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrderController {

    @GetMapping("/{id}")
    fun getOrder(@PathVariable id: Int): Order {
        return Order(
            id = id,
            customer = "Jane Smith",
            service = "Haircut",
            status = "confirmed",
            appointmentTime = "2026-03-25T10:00:00"
        )
    }
}
