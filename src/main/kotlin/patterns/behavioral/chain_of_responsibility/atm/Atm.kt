package team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.atm

import team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.abstraction.DispenseChain
import team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.dispenser.FiftyBillDispenser
import team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.dispenser.TenBillDispenser
import team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.dispenser.TwentyBillDispenser
import team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.model.Currency


class Atm {
    private val chain: DispenseChain = FiftyBillDispenser()

    init {
        val twentyBillDispenser = TwentyBillDispenser()
        val tenBillDispenser = TenBillDispenser()

        chain.setNext(twentyBillDispenser)
        twentyBillDispenser.setNext(tenBillDispenser)
    }

    fun withdraw(amount: Int) {
        check(amount % 10 == 0) { "Amount must be a multiple of 10th" }

        println("Withdraw $amount")
        chain.dispense(Currency(amount))
        println()
    }
}