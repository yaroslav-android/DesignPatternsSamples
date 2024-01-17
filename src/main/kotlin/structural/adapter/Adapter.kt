package team.idivision.samples.designpatterns.structural.adapter

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.structural.adapter.adapter.SquarePegAdapter
import team.idivision.samples.designpatterns.structural.adapter.model.RoundPeg
import team.idivision.samples.designpatterns.structural.adapter.model.SquarePeg
import team.idivision.samples.designpatterns.structural.adapter.shape.RoundHole


class Adapter : Pattern {
    override fun name(): String = "Adapter"

    override fun launch() {
        val roundHole = RoundHole(3.0)

        val largePeg = RoundPeg(5.0)
        val equalPeg = RoundPeg(3.0)
        val smallPeg = SquarePeg(4.0)
        val pegAdapter = SquarePegAdapter(smallPeg)

        println("Round hole with radius ${roundHole.radius}")
        println("Can fit $largePeg => ${roundHole.fits(largePeg)}")
        println("Can fit $equalPeg => ${roundHole.fits(equalPeg)}")
        println("Can fit $smallPeg => ${roundHole.fits(pegAdapter.asRoundPeg())}")
    }
}