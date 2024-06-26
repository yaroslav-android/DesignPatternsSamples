package team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.abstraction

import team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.model.Currency


interface DispenseChain {
    fun setNext(next: DispenseChain)
    fun dispense(currency: Currency)
}