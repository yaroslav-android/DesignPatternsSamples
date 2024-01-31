package team.idivision.samples.designpatterns.behavioral.state.machine

import team.idivision.samples.designpatterns.behavioral.state.abstraction.AbstractState
import team.idivision.samples.designpatterns.behavioral.state.states.NoQuarterState


class GumballMachine(private var gumballCount: Int) {
    private var currentState: AbstractState = NoQuarterState()

    fun insertQuarter() {
        currentState.insertQuarter(this)
    }

    fun ejectQuarter() {
        currentState.ejectQuarter(this)
    }

    fun turnCrank() {
        currentState.turnCrank(this)
        currentState.dispense(this)
    }

    fun setState(state: AbstractState) {
        currentState = state
    }

    fun getGumballCount(): Int {
        return gumballCount
    }

    fun releaseBall() {
        println("A gumball is rolling out...")
        if (gumballCount > 0) {
            gumballCount--
        }
    }
}