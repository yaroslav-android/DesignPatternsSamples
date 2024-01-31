package team.idivision.samples.designpatterns.behavioral.state.states

import team.idivision.samples.designpatterns.behavioral.state.abstraction.AbstractState
import team.idivision.samples.designpatterns.behavioral.state.machine.GumballMachine


class SoldState : AbstractState() {

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