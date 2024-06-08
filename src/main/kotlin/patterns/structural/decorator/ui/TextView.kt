package team.idivision.samples.designpatterns.patterns.structural.decorator.ui

import team.idivision.samples.designpatterns.patterns.structural.decorator.abstraction.VisualComponent


class TextView : VisualComponent {
    override fun draw() {
        println("Draws a text.")
    }
}