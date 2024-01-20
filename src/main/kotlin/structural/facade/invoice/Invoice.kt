package team.idivision.samples.designpatterns.structural.facade.invoice


class Invoice {
    fun sendInvoice(email: String) {
        println("Sending invoice to $email")
    }
}