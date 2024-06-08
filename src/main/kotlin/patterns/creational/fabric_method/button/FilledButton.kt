package team.idivision.samples.designpatterns.patterns.creational.fabric_method.button

import team.idivision.samples.designpatterns.patterns.creational.fabric_method.abstraction.Button


class FilledButton : Button {

    override fun draw() {
        println("[ FilledButton ]")
    }

    override fun click() {
        // click-click ..
    }
}