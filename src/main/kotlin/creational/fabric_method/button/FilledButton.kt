package team.idivision.samples.designpatterns.creational.fabric_method.button

import team.idivision.samples.designpatterns.creational.fabric_method.abstraction.Button


class FilledButton : Button {

    override fun render() {
        println("Rendered: FilledButton")
    }

    override fun click() {

    }
}