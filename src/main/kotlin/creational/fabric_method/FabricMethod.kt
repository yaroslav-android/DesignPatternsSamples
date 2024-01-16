package team.idivision.samples.designpatterns.creational.fabric_method

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.creational.fabric_method.dialog.AlertDialog
import team.idivision.samples.designpatterns.creational.fabric_method.dialog.Dialog
import team.idivision.samples.designpatterns.creational.fabric_method.dialog.PrompDialog


class FabricMethod(
    private val isPromotionNotification: Boolean = false
) : Pattern {
    override fun name(): String = "FabricMethod"

    override fun launch() {
        val dialog: Dialog = if (isPromotionNotification) {
            PrompDialog()
        } else {
            AlertDialog()
        }

        dialog.renderDialog()
    }
}