package team.idivision.samples.designpatterns.patterns.behavioral.state.states

import team.idivision.samples.designpatterns.patterns.behavioral.state.abstraction.AbstractState
import team.idivision.samples.designpatterns.patterns.behavioral.state.machine.GumballMachine


class HasQuarterState : AbstractState() {

    override fun insertQuarter(gumballMachine: GumballMachine) {
        println("You can't insert another quarter.")
    }

    override fun ejectQuarter(gumballMachine: GumballMachine) {
        println("Quarter returned.")
        gumballMachine.setState(NoQuarterState())
    }

    override fun turnCrank(gumballMachine: GumballMachine) {
        println("You turned...")
        gumballMachine.setState(SoldState())
    }

    override fun dispense(gumballMachine: GumballMachine) {
        println("No gumball dispensed.")
    }
}