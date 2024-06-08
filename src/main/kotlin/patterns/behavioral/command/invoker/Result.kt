package team.idivision.samples.designpatterns.patterns.behavioral.command.invoker

import team.idivision.samples.designpatterns.patterns.behavioral.command.abstraction.Invoker


class Result : Invoker {
    private var value = 0

    override fun setValue(value: Int) {
        this.value = value
    }

    override fun getValue(): Int = value

    fun preview() {
        println("Result: $value")
    }
}