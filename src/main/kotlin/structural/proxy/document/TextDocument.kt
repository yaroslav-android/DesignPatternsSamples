package team.idivision.samples.designpatterns.structural.proxy.document

import team.idivision.samples.designpatterns.structural.proxy.abstraction.Graphics


class TextDocument {
    fun insertImage(graphics: Graphics) {
        println("Image extent = ${graphics.getExtent()}")
        graphics.draw()
    }
}