package team.idivision.samples.designpatterns.patterns.behavioral.state.states

import team.idivision.samples.designpatterns.patterns.behavioral.state.abstraction.AbstractState
import team.idivision.samples.designpatterns.patterns.behavioral.state.machine.GumballMachine


class SoldState : AbstractState() {

    override fun insertQuarter(gumballMachine: GumballMachine) {
        println("Please wait, we're already giving you a gumball.")
    }

    override fun ejectQuarter(gumballMachine: GumballMachine) {
        println("Sorry, you already turned the crank.")
    }

    override fun turnCrank(gumballMachine: GumballMachine) {
        println("Turning twice doesn't get you another gumball!")
    }

    override fun dispense(gumballMachine: GumballMachine) {
        gumballMachine.releaseBall()

        if (gumballMachine.getGumballCount() > 0) {
            gumballMachine.setState(NoQuarterState())
        } else {
            println("Oops, out of gumballs!")
            gumballMachine.setState(SoldOutState())
        }
    }
}