package team.idivision.samples.designpatterns.patterns.creational.fabric_method.button

import team.idivision.samples.designpatterns.patterns.creational.fabric_method.abstraction.Button


class OutlineButton : Button {

    override fun draw() {
        println("[ OutlineButton ]")
    }

    override fun click() {
        // click-click ..
    }
}