package team.idivision.samples.designpatterns.behavioral.command.abstraction

import kotlin.properties.Delegates


abstract class AbstractCommand(
    protected val invoker: Invoker
) {
    private var backup by Delegates.notNull<Int>()

    abstract fun execute(value: Int): Boolean

    fun undo() {
        invoker.setValue(backup)
    }

    protected fun backup() {
        backup = invoker.getValue()
    }
}