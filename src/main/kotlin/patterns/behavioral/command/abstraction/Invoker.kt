package team.idivision.samples.designpatterns.patterns.behavioral.command.abstraction


interface Invoker {
    fun setValue(value: Int)
    fun getValue(): Int
}