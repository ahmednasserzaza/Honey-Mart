package com.the_chance.plugins


import com.the_chance.data.ProductService
import com.the_chance.data.ServerResponse
import com.the_chance.endpoints.productsRoutes
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting(
    productService: ProductService
) {
    routing {
        get("/") {
            call.respond(ServerResponse.success("Welcome to Honey Mart app"))
        }
        productsRoutes(productService)
    }
}
