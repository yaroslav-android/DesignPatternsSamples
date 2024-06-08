package team.idivision.samples.designpatterns.patterns.structural.facade.order

import team.idivision.samples.designpatterns.patterns.structural.facade.invoice.Invoice
import team.idivision.samples.designpatterns.patterns.structural.facade.payment.Payment
import team.idivision.samples.designpatterns.patterns.structural.facade.product.Product
import team.idivision.samples.designpatterns.patterns.structural.facade.user.User


class Order(private val user: User) {

    fun create(productId: String) {
        val product = Product()
            .also { product ->
                product.getProductDetails(id = productId)
            }

        val payment = Payment(product)
        payment.makePayment()

        val invoice = Invoice()
        invoice.sendInvoice(user.email)
    }
}