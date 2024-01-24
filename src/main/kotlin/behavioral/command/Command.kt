package team.idivision.samples.designpatterns.behavioral.command

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.behavioral.command.cmd.AddCommand
import team.idivision.samples.designpatterns.behavioral.command.cmd.SubCommand
import team.idivision.samples.designpatterns.behavioral.command.invoker.Result
import team.idivision.samples.designpatterns.behavioral.command.util.CommandHistory

/** Use the Command pattern when you want to
 * Encapsulate a request as an object, thereby letting you parameterize
 * clients with different requests, queue or log requests, and support undoable operations.
 *
 * - parameterize objects by an action to perform, as MenuItem objects did above.
 *      You can express such parameterization in a procedural language with a callback function,
 *      that is, a function that's registered somewhere to be called at a later point.
 *      Commands are an object-oriented replacement for callbacks.
 * - specify, queue, and execute requests at different times. A Command object can have a lifetime independent of
 *      the original request. If the receiver of a request can be represented in an address space-independent way,
 *      then you can transfer a command object for the request to a different process and fulfill the request there.
 * - support undo. The Command's Execute operation can store state for reversing its effects in the command itself.
 *      The Command interface must have an added Unexecute operation that reverses the effects of
 *      a previous call to Execute. Executed commands are stored in a history list.
 *      Unlimited-level undo and redo is achieved by traversing this list backwards and forwards
 *      calling Unexecute and Execute, respectively.
 * - support logging changes so that they can be reapplied in case of a system crash. By augmenting
 *      the Command interface with load and store operations, you can keep a persistent log of changes.
 *      Recovering from a crash involves reloading logged commands from disk and
 *      reexecuting them with the Execute operation.
 * - structure a system around high-level operations built on primitives operations. Such a structure is common in
 *      information systems that support transactions. A transaction encapsulates a set of changes to data.
 *      The Command pattern offers a way to model transactions. Commands have a common interface, letting you
 *      invoke all transactions the same way. The pattern also makes it easy to extend the system with new transactions.
 */
class Command : Pattern("Command") {
    override fun launch() {
        val result = Result()

        val commandHistory = CommandHistory()
        val addCommand = AddCommand(result)
        val subCommand = SubCommand(result)

        if (addCommand.execute(50)) {
            commandHistory.insert(addCommand)
        }
        result.preview()

        if (subCommand.execute(20)) {
            commandHistory.insert(subCommand)
        }
        result.preview()

        undo(commandHistory)
        result.preview()
    }

    private fun undo(history: CommandHistory) {
        if (history.isEmpty()) return
        history.remove().undo()
    }
}