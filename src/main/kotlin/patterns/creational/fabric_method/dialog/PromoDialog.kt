package team.idivision.samples.designpatterns.patterns.creational.fabric_method.dialog

import team.idivision.samples.designpatterns.patterns.creational.fabric_method.abstraction.Button
import team.idivision.samples.designpatterns.patterns.creational.fabric_method.abstraction.Dialog
import team.idivision.samples.designpatterns.patterns.creational.fabric_method.button.OutlineButton


class PromoDialog : Dialog() {
    override fun name(): String = "PromoDialog"

    override fun createButton(): Button = OutlineButton()
}