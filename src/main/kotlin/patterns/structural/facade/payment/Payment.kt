package team.idivision.samples.designpatterns.patterns.structural.facade.payment

import team.idivision.samples.designpatterns.patterns.structural.facade.product.Product


class Payment(private val product: Product) {

    fun makePayment() {
        println("Making payment for ${product.details}")
    }
}