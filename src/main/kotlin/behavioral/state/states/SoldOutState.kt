package team.idivision.samples.designpatterns.behavioral.state.states

import team.idivision.samples.designpatterns.behavioral.state.abstraction.AbstractState
import team.idivision.samples.designpatterns.behavioral.state.machine.GumballMachine


class SoldOutState : AbstractState() {
    override fun dispense(gumballMachine: GumballMachine) {
        println("No gumball dispensed. Machine is sold out.")
    }
}