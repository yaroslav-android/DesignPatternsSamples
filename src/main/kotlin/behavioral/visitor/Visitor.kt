package team.idivision.samples.designpatterns.behavioral.visitor

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.behavioral.visitor.packages.LargeContainer
import team.idivision.samples.designpatterns.behavioral.visitor.packages.MediumBox
import team.idivision.samples.designpatterns.behavioral.visitor.packages.SmallParcel
import team.idivision.samples.designpatterns.behavioral.visitor.visitors.ShippingCostVisitor

/** Use the Visitor pattern when
 * Represent an operation to be performed on the elements of an object structure.
 * Visitor lets you define a new operation without changing the classes of the elements
 * on which it operates.
 *
 * - an object structure contains many classes of objects with differing interfaces,
 *      and you want to perform operations on these objects that depend on their concrete classes.
 * - many distinct and unrelated operations need to be performed on objects in an object structure,
 *      and you want to avoid "polluting" their classes with these operations.
 *      Visitor lets you keep related operations together by defining them in one class.
 *      When the object structure is shared by many applications, use Visitor to put operations in just
 *      those applications that need them.
 * - the classes defining the object structure rarely change, but you often want to define new operations
 *      over the structure. Changing the object structure classes requires redefining the interface to
 *      all visitors, which is potentially costly. If the object structure classes change often,
 *      then it's probably better to define the operations in those classes.
 */
class Visitor : Pattern("Visitor") {
    override fun launch() {
        val packages = listOf(
            SmallParcel(weight = 1.5f),
            MediumBox(weight = 3f, dimensions = 10f to 15f),
            LargeContainer(weight = 10f, dimensions = Triple(20f, 30f, 45f))
        )

        val shippingCostVisitor = ShippingCostVisitor()
        println("Applying shipping cost:")
        packages.forEach { it.accept(shippingCostVisitor) }
        println("Total Shipping Cost: $${shippingCostVisitor.getCost()}")
    }
}