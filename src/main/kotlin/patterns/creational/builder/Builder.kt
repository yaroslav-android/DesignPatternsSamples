package team.idivision.samples.designpatterns.patterns.creational.builder

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.creational.builder.menu.Menu
import team.idivision.samples.designpatterns.patterns.creational.builder.menu.MenuBuilder
import team.idivision.samples.designpatterns.patterns.creational.builder.model.Salad
import team.idivision.samples.designpatterns.patterns.creational.builder.model.Soup

/** Use the Builder pattern when
 *
 * Separate the construction of a complex object from its representation
 * so that the same construction process can create different representations.
 *
 * - the algorithm for creating a complex object should be independent of the parts
 *      that make up the object and how they're assembled.
 * - the construction process must allow different representations
 *      for the object that's constructed.
 */
class Builder : Pattern("Builder") {

    override fun launch() {
        val menu: Menu = MenuBuilder()
            .setSoup(Soup.Borsch)
            .setSalad(Salad.Greek)
            .build()

        println(menu)
    }
}