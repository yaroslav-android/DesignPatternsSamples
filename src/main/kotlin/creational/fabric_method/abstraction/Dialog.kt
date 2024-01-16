package team.idivision.samples.designpatterns.creational.fabric_method.abstraction

abstract class Dialog {

    protected abstract fun createButton(): Button
    protected abstract fun name(): String

    fun renderDialog() {
        println("Dialog: ${name()}")
        createButton().render()
    }

}