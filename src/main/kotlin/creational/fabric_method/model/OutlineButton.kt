package team.idivision.samples.designpatterns.creational.fabric_method.model

import team.idivision.samples.designpatterns.creational.fabric_method.abstraction.Button


class OutlineButton : Button {

    override fun render() {
        println("Rendered: OutlineButton")
    }

    override fun click() {

    }
}