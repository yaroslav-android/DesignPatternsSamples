package team.idivision.samples.designpatterns.behavioral.command.abstraction


interface Invoker {
    fun setValue(value: Int)
    fun getValue(): Int
}