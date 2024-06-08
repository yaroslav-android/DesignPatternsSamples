package team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.behavioral.chain_of_responsibility.atm.Atm


/** Use Chain of Responsibility when
 * Avoid coupling the sender of a request to its receiver by giving more than
 * one object a chance to handle the request. Chain the receiving objects and pass the request along
 * the chain until an object handles it.
 *
 * - more than one object may handle a request, and the handler isn't known apriori.
 *      The handler should be ascertained automatically.
 * - you want to issue a request to one of several objects without specifying the receiver explicitly.
 * - the set of objects that can handle a request should be specified dynamically.
 */
class ChainOfResponsibility : Pattern("Chain of Responsibility") {

    override fun launch() {
        val atm = Atm()
        atm.withdraw(390)
        atm.withdraw(120)
    }
}