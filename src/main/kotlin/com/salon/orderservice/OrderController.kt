package com.salon.orderservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrderController {

    @GetMapping("/{id}")
    fun getOrder(@PathVariable id: Int): Map<String, Any> {
        return mapOf(
            "id" to id,
            "customer" to "Jane Smith",
            "service" to "Haircut",
            "status" to "confirmed",
            "appointmentTime" to "2026-03-25T10:00:00"
        )
    }
}
