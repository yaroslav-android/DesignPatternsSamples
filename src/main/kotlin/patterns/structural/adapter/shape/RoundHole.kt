package team.idivision.samples.designpatterns.patterns.structural.adapter.shape

import team.idivision.samples.designpatterns.patterns.structural.adapter.model.RoundPeg


class RoundHole(val radius: Double) {
    fun fits(peg: RoundPeg): Boolean = radius >= peg.radius
}