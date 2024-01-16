package team.idivision.samples.designpatterns.creational.fabric_method.dialog

import team.idivision.samples.designpatterns.creational.fabric_method.abstraction.Button
import team.idivision.samples.designpatterns.creational.fabric_method.abstraction.Dialog
import team.idivision.samples.designpatterns.creational.fabric_method.button.FilledButton

class AlertDialog : Dialog() {
    override fun name(): String = "AlertDialog"

    override fun createButton(): Button = FilledButton()
}