package team.idivision.samples.designpatterns.patterns.creational.fabric_method

import team.idivision.samples.designpatterns.patterns.Pattern


/** Use the Factory Method pattern when
 *
 * Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 *
 * - a class can't anticipate the class of objects it must create.
 * - a class wants its subclasses to specify the objects it creates.
 * - classes delegate responsibility to one of several helper subclasses,
 *      and you want to localize the knowledge of which helper subclass is the delegate.
 */
class FabricMethod(
    private val isPromotionNotification: Boolean = false
) : Pattern("FabricMethod") {

    override fun launch() {
        val dialog: team.idivision.samples.designpatterns.patterns.creational.fabric_method.abstraction.Dialog =
            if (isPromotionNotification) {
                team.idivision.samples.designpatterns.patterns.creational.fabric_method.dialog.PromoDialog()
            } else {
                team.idivision.samples.designpatterns.patterns.creational.fabric_method.dialog.AlertDialog()
            }

        dialog.drawDialog()
    }
}