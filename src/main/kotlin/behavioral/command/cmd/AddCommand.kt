package team.idivision.samples.designpatterns.behavioral.command.cmd

import team.idivision.samples.designpatterns.behavioral.command.abstraction.AbstractCommand
import team.idivision.samples.designpatterns.behavioral.command.abstraction.Invoker


class AddCommand(invoker: Invoker) : AbstractCommand(invoker) {

    override fun execute(value: Int): Boolean {
        backup()
        invoker.setValue(invoker.getValue() + value)

        return true
    }
}