package team.idivision.samples.designpatterns.structural.adapter.adapter

import team.idivision.samples.designpatterns.structural.adapter.model.RoundPeg
import team.idivision.samples.designpatterns.structural.adapter.model.SquarePeg
import kotlin.math.sqrt


class SquarePegAdapter(
    private val peg: SquarePeg
) {
    fun asRoundPeg(): RoundPeg {
        return RoundPeg(
            (peg.length / 2) * sqrt(2.0)
        )
    }
}