package team.idivision.samples.designpatterns.creational.fabric_method.abstraction

import team.idivision.samples.designpatterns.creational.fabric_method.abstraction.Button

abstract class Dialog {

    protected abstract fun createButton(): Button
    protected abstract fun name(): String

    fun renderDialog() {
        println("\nDialog: ${name()}")
        createButton().render()
    }

}