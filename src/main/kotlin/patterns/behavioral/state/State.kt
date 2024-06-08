package team.idivision.samples.designpatterns.patterns.behavioral.state

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.behavioral.state.machine.GumballMachine


/**
 * Use the State pattern in either of the following cases.
 *
 * Allow an object to alter its behavior when its internal state changes.The object will appear to change its class.
 *
 * - An object's behavior depends on its state, and it must change its behavior at run-time depending on that state.
 * - Operations have large, multipart conditional statements that depend on the object's state.
 *      This state is usually represented by one or more enumerated constants. Often, several operations will
 *      contain this same conditional structure. The State pattern puts each branch of
 *      the conditional in a separate class. This lets you treat the object's state as an object in its
 *      own right that can vary independently of other objects.
 */
class State : Pattern("State") {

    override fun launch() {
        val gumballMachine = GumballMachine(5)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        gumballMachine.insertQuarter()
        gumballMachine.ejectQuarter()
        gumballMachine.turnCrank()

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
    }
}