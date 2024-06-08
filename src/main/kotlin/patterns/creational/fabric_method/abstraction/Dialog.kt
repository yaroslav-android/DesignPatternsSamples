package team.idivision.samples.designpatterns.patterns.creational.fabric_method.abstraction


abstract class Dialog {

    protected abstract fun createButton(): Button
    protected abstract fun name(): String

    fun drawDialog() {
        println("Dialog: ${name()}")
        createButton().draw()
    }

}