package team.idivision.samples.designpatterns.patterns.structural.composite.pc

import team.idivision.samples.designpatterns.patterns.structural.composite.abstraction.CompositeEquipment
import team.idivision.samples.designpatterns.patterns.structural.composite.util.Watt


class Cabinet(name: String) : CompositeEquipment(name) {

    override fun power(): Watt =
        Watt(super.power().watt + 0.2f)
}