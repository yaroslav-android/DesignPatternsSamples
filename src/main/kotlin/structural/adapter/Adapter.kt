package team.idivision.samples.designpatterns.structural.adapter

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.structural.adapter.adapter.SquarePegAdapter
import team.idivision.samples.designpatterns.structural.adapter.model.RoundPeg
import team.idivision.samples.designpatterns.structural.adapter.model.SquarePeg
import team.idivision.samples.designpatterns.structural.adapter.shape.RoundHole

/** Use the Adapter pattern when
 *
 * Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 *
 * - you want to use an existing class, and its interface does not match the one you need.
 * - you want to create a reusable class that cooperates with unrelated or unforeseen classes,
 *      that is, classes that don't necessarily have compatible interfaces.
 * - (object adapter only) you need to use several existing subclasses, but it's impractical to adapt
 *      their interface by subclassing every one. An object adapter can adapt the interface of its parent class.
 */
class Adapter : Pattern("Adapter") {

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