package team.idivision.samples.designpatterns.patterns.structural.decorator.implementation

import team.idivision.samples.designpatterns.patterns.structural.decorator.abstraction.VisualComponent


abstract class VisualComponentDecorator(
    private val visualComponent: VisualComponent,
) : VisualComponent {

    override fun draw() {
        visualComponent.draw()
    }
}