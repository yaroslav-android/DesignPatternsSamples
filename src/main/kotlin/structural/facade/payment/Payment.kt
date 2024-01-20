package team.idivision.samples.designpatterns.structural.facade.payment

import team.idivision.samples.designpatterns.structural.facade.product.Product


class Payment(private val product: Product) {
    fun makePayment() {
        println("Making payment for ${product.details}")
    }
}