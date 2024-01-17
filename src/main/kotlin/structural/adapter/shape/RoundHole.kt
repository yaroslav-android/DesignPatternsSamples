package team.idivision.samples.designpatterns.structural.adapter.shape

import team.idivision.samples.designpatterns.structural.adapter.model.RoundPeg

class RoundHole(
    val radius: Double
) {
    fun fits(peg: RoundPeg): Boolean {
        return this.radius >= peg.radius
    }
}