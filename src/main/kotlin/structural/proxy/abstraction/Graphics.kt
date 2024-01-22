package team.idivision.samples.designpatterns.structural.proxy.abstraction

import java.awt.Point


interface Graphics {
    fun draw()

    fun getExtent(): Point

    fun load()
    fun save()
}