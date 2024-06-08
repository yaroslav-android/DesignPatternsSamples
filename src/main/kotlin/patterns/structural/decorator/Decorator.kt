package team.idivision.samples.designpatterns.patterns.structural.decorator

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.structural.decorator.implementation.BorderDecorator
import team.idivision.samples.designpatterns.patterns.structural.decorator.ui.TextView


/** Use Decorator
 * Attach additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 *
 * - to add responsibilities to individual objects dynamically and transparently, that is,
 *      without affecting other objects.
 * - for responsibilities that can be withdrawn.
 * - when extension by subclassing is impractical. Sometimes a large number of independent extensions
 *      are possible and would produce an explosion of subclasses to support every combination.
 *      Or a class definition may be hidden or otherwise unavailable for subclassing.
 */
class Decorator : Pattern("Decorator") {

    override fun launch() {
        val text = TextView()

        val border = BorderDecorator(
            visualComponent = text,
            borderWidth = 5,
        )

        border.draw()
    }
}