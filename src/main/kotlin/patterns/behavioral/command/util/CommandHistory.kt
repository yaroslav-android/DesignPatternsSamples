package team.idivision.samples.designpatterns.patterns.behavioral.command.util

import team.idivision.samples.designpatterns.patterns.behavioral.command.abstraction.AbstractCommand


class CommandHistory {
    private val commands = ArrayDeque<AbstractCommand>()

    fun push(command: AbstractCommand) =
        commands.addLast(command)

    fun pop(): AbstractCommand =
        commands.removeLast()

    fun isEmpty() =
        commands.isEmpty()
}