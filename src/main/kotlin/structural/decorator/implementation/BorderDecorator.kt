package team.idivision.samples.designpatterns.structural.decorator.implementation

import team.idivision.samples.designpatterns.structural.decorator.abstraction.VisualComponent


class BorderDecorator(
    visualComponent: VisualComponent,
    private val borderWidth: Int,
) : VisualComponentDecorator(visualComponent = visualComponent) {

    override fun draw() {
        super.draw()
        drawBorder()
    }

    private fun drawBorder() {
        println("Draws a border of width $borderWidth.")
    }
}