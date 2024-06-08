package team.idivision.samples.designpatterns.patterns.behavioral.state.states

import team.idivision.samples.designpatterns.patterns.behavioral.state.abstraction.AbstractState
import team.idivision.samples.designpatterns.patterns.behavioral.state.machine.GumballMachine


class NoQuarterState : AbstractState() {

    override fun insertQuarter(gumballMachine: GumballMachine) {
        gumballMachine.setState(HasQuarterState())
    }

    override fun ejectQuarter(gumballMachine: GumballMachine) {
        println("You haven't inserted a quarter.")
    }

    override fun turnCrank(gumballMachine: GumballMachine) {
        println("You turned, but there's no quarter.")
    }

    override fun dispense(gumballMachine: GumballMachine) {
        println("You need to pay first.")
    }
}