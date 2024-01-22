package team.idivision.samples.designpatterns.behavioral.chain_of_responsibility.dispenser

import team.idivision.samples.designpatterns.behavioral.chain_of_responsibility.abstraction.DispenseChain
import team.idivision.samples.designpatterns.behavioral.chain_of_responsibility.model.Currency


class FiftyBillDispenser : DispenseChain {
    private var chain: DispenseChain? = null

    override fun setNext(next: DispenseChain) {
        chain = next
    }

    override fun dispense(currency: Currency) {
        if (currency.value < DISPENSE_AMOUNT) {
            chain?.dispense(currency)
            return
        }

        val amount = currency.value / DISPENSE_AMOUNT
        val reminder = currency.value % DISPENSE_AMOUNT

        if (amount > 1) {
            println("dispensing $amount $DISPENSE_AMOUNT notes")
        } else {
            println("dispensing $amount $DISPENSE_AMOUNT note")
        }

        if (reminder != 0) {
            val newValue = Currency(reminder)
            chain?.dispense(newValue)
        }
    }

    companion object {
        private const val DISPENSE_AMOUNT = 50
    }
}