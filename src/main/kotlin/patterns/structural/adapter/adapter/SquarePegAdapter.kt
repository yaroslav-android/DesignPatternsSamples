package team.idivision.samples.designpatterns.patterns.structural.adapter.adapter

import team.idivision.samples.designpatterns.patterns.structural.adapter.model.RoundPeg
import team.idivision.samples.designpatterns.patterns.structural.adapter.model.SquarePeg
import kotlin.math.sqrt


class SquarePegAdapter(private val peg: SquarePeg) {

    fun getRoundPeg(): RoundPeg =
        RoundPeg((peg.length / 2) * sqrt(2.0))
}