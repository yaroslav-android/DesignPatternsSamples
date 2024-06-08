package team.idivision.samples.designpatterns.patterns.structural.facade.invoice


class Invoice {

    fun sendInvoice(email: String) {
        println("Sending invoice to $email")
    }
}