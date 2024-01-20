package team.idivision.samples.designpatterns.structural.composite.pc

import team.idivision.samples.designpatterns.structural.composite.abstraction.Equipment
import team.idivision.samples.designpatterns.structural.composite.util.Currency
import team.idivision.samples.designpatterns.structural.composite.util.Watt


class Gpu(name: String) : Equipment(name = name) {
    override fun power(): Watt = Watt(0.6f)

    override fun netPrice(): Currency = Currency(100000f)

    override fun discountPrice(): Currency = Currency(89999f)
}