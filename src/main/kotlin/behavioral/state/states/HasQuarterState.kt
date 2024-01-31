package team.idivision.samples.designpatterns.behavioral.state.states

import team.idivision.samples.designpatterns.behavioral.state.abstraction.AbstractState
import team.idivision.samples.designpatterns.behavioral.state.machine.GumballMachine


class HasQuarterState : AbstractState() {

    override fun ejectQuarter(gumballMachine: GumballMachine) {
        gumballMachine.setState(NoQuarterState())
    }

    override fun turnCrank(gumballMachine: GumballMachine) {
        if (gumballMachine.getGumballCount() > 0) {
            gumballMachine.setState(SoldState())
        } else {
            gumballMachine.setState(SoldOutState())
        }
    }

    override fun dispense(gumballMachine: GumballMachine) {
        println("No gumball dispensed.")
    }
}