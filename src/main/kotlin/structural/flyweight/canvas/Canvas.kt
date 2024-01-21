package team.idivision.samples.designpatterns.structural.flyweight.canvas

import java.awt.Color


class Canvas {

    private fun draw(color: Color, x: Float, y: Float, radius: Float) {
        println("Draw x=$x, y=$y with color=$color and radius=$radius")
    }

    fun drawCircle(color: Color, x: Float, y: Float, radius: Float) {
        draw(color, x, y, radius)
    }

    fun drawRect(color: Color, x: Float, y: Float) {
        draw(color, x, y, 0f)
    }
}