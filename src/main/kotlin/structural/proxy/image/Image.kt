package team.idivision.samples.designpatterns.structural.proxy.image

import team.idivision.samples.designpatterns.structural.proxy.abstraction.Graphics
import java.awt.Point


class Image(private val fileName: String) : Graphics {
    private var extent = Point(1, 1)

    override fun draw() {
        println("draws the $fileName image")
    }

    override fun getExtent(): Point = extent

    override fun load() {
        println("loading image $fileName")
    }

    override fun save() {
        println("saving image $fileName")
    }
}