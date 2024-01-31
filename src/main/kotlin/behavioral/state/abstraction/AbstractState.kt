package team.idivision.samples.designpatterns.behavioral.state.abstraction

import team.idivision.samples.designpatterns.behavioral.state.machine.GumballMachine


abstract class AbstractState {
    open fun insertQuarter(gumballMachine: GumballMachine) {}
    open fun ejectQuarter(gumballMachine: GumballMachine) {}
    open fun turnCrank(gumballMachine: GumballMachine) {}
    open fun dispense(gumballMachine: GumballMachine) {}
}