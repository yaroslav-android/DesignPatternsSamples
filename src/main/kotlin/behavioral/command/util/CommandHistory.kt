package team.idivision.samples.designpatterns.behavioral.command.util

import team.idivision.samples.designpatterns.behavioral.command.abstraction.AbstractCommand


class CommandHistory {
    private val commands = ArrayDeque<AbstractCommand>()

    fun insert(command: AbstractCommand) = commands.addLast(command)

    fun remove(): AbstractCommand = commands.removeLast()

    fun isEmpty() = commands.isEmpty()
}