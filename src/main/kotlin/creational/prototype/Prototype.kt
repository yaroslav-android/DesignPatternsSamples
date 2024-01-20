package team.idivision.samples.designpatterns.creational.prototype

import team.idivision.samples.designpatterns.Pattern


/** Use the Prototype pattern when a system should be independent of how its products are created,
 * composed, and represented; and
 *
 * Specify the kinds of objects to create using a prototypical instance,
 * and create new objects by copying this prototype.
 *
 * - when the classes to instantiate are specified at run-time, for example, by dynamic loading; or
 * - to avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
 * - when instances of a class can have one of only a few different combinations of state.
 *    It may be more convenient to install a corresponding number of prototypes and clone them rather than
 *    instantiating the class manually, each time with the appropriate state.
 */
class Prototype : Pattern {
    override fun name(): String = "Prototype"

    override fun launch() {
        println("Documentation only")
    }
}