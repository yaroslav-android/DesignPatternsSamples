package team.idivision.samples.designpatterns.creational.fabric_method.dialog

import team.idivision.samples.designpatterns.creational.fabric_method.model.FilledButton
import team.idivision.samples.designpatterns.creational.fabric_method.abstraction.Button
import team.idivision.samples.designpatterns.creational.fabric_method.abstraction.Dialog

class AlertDialog : Dialog() {
    override fun name(): String = "AlertDialog"

    override fun createButton(): Button = FilledButton()
}