package team.idivision.samples.designpatterns.behavioral.state.states

import team.idivision.samples.designpatterns.behavioral.state.abstraction.AbstractState
import team.idivision.samples.designpatterns.behavioral.state.machine.GumballMachine


class SoldOutState : AbstractState() {

    override fun insertQuarter(gumballMachine: GumballMachine) {
        println("Sorry, the machine is sold out.")
    }

    override fun ejectQuarter(gumballMachine: GumballMachine) {
        println("You haven't inserted a quarter.")
    }

    override fun turnCrank(gumballMachine: GumballMachine) {
        println("Sorry, the machine is sold out.")
    }

    override fun dispense(gumballMachine: GumballMachine) {
        println("No gumball dispensed. Machine is sold out.")
    }
}