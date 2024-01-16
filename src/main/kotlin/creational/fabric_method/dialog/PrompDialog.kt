package team.idivision.samples.designpatterns.creational.fabric_method.dialog

import team.idivision.samples.designpatterns.creational.fabric_method.abstraction.Button
import team.idivision.samples.designpatterns.creational.fabric_method.dialog.Dialog
import team.idivision.samples.designpatterns.creational.fabric_method.model.OutlineButton

class PrompDialog : Dialog() {
    override fun name(): String = "PrompDialog"
    override fun createButton(): Button = OutlineButton()
}