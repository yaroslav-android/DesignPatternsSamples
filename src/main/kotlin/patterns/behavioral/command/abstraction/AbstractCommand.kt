package team.idivision.samples.designpatterns.patterns.behavioral.command.abstraction

import kotlin.properties.Delegates


abstract class AbstractCommand(protected val invoker: Invoker) {
    private var backup by Delegates.notNull<Int>()

    abstract fun execute(value: Int): Boolean

    fun undo(): Boolean {
        invoker.setValue(backup)
        return true
    }

    protected fun backup() {
        backup = invoker.getValue()
    }
}