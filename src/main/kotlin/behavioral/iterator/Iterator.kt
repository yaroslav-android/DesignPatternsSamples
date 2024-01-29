package team.idivision.samples.designpatterns.behavioral.iterator

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.behavioral.iterator.implementation.CustomList

/** Use the Iterator pattern
 *
 * Provide a way to access the elements of an aggregate object sequentially without exposing
 * its underlying representation.
 *
 * - to access an aggregate object's contents without exposing its internal representation.
 * - to support multiple traversals of aggregate objects.
 * - to provide a uniform interface for traversing different aggregate structures
 *      (that is, to support polymorphic iteration).
 */
class Iterator : Pattern("Iterator") {
    override fun launch() {
        val list: CustomList<Int> = CustomList()
        list.addAll(listOf(1, 2, 3, 4))

        val iterator = list.getIterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }
}