package team.idivision.samples.designpatterns.patterns.structural.decorator.implementation

import team.idivision.samples.designpatterns.patterns.structural.decorator.abstraction.VisualComponent


class BorderDecorator(
    visualComponent: VisualComponent,
    private val borderWidth: Int,
) : VisualComponentDecorator(visualComponent) {

    override fun draw() {
        super.draw()
        drawBorder()
    }

    private fun drawBorder() {
        println("Draws a border of width $borderWidth.")
    }
}