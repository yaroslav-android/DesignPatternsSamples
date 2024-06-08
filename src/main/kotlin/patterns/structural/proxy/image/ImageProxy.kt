package team.idivision.samples.designpatterns.patterns.structural.proxy.image

import team.idivision.samples.designpatterns.patterns.structural.proxy.abstraction.Graphics
import java.awt.Point


class ImageProxy(private val fileName: String) : Graphics {
    private var image: Image? = null
    private var extent: Point? = null

    private fun getImage(): Image {
        if (image == null) {
            image = Image(fileName)
        }

        return image!!
    }

    override fun getExtent(): Point {
        if (extent == null) {
            extent = getImage().getExtent()
        }

        return extent!!
    }

    override fun draw() {
        getImage().draw()
    }

    override fun load() {
        getImage().load()
    }

    override fun save() {
        getImage().save()
    }
}