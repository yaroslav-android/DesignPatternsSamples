package team.idivision.samples.designpatterns.structural.composite.pc

import team.idivision.samples.designpatterns.structural.composite.abstraction.CompositeEquipment
import team.idivision.samples.designpatterns.structural.composite.util.Watt


class Cabinet(name: String) : CompositeEquipment(name = name) {
    override fun power(): Watt = Watt(super.power().watt + 0.2f)
}