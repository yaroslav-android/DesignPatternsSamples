package team.idivision.samples.designpatterns.creational.singleton

import team.idivision.samples.designpatterns.Pattern

/** Use the Singleton pattern when
 *
 * Ensure a class only has one instance, and provide a global point of access to it.
 *
 * - there must be exactly one instance of a class, and it must be accessible to clients
 *      from a well-known access point.
 * - when the sole instance should be extensible by subclassing, and clients should be able to use
 *      an extended instance without modifying their code.
 */
class Singleton : Pattern {
    override fun name(): String = "Singleton"

    override fun launch() {
        println("Documentation only")
    }
}