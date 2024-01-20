package team.idivision.samples.designpatterns.structural.composite.pc

import team.idivision.samples.designpatterns.structural.composite.abstraction.Equipment
import team.idivision.samples.designpatterns.structural.composite.util.Currency
import team.idivision.samples.designpatterns.structural.composite.util.Watt


class Cpu(name: String) : Equipment(name = name) {
    override fun power(): Watt = Watt(0.4f)

    override fun netPrice(): Currency = Currency(20000f)

    override fun discountPrice(): Currency = Currency(18999f)
}