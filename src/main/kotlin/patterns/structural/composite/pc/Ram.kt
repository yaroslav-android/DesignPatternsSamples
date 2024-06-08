package team.idivision.samples.designpatterns.patterns.structural.composite.pc

import team.idivision.samples.designpatterns.patterns.structural.composite.abstraction.Equipment
import team.idivision.samples.designpatterns.patterns.structural.composite.util.Currency
import team.idivision.samples.designpatterns.patterns.structural.composite.util.Watt


class Ram(name: String) : Equipment(name) {

    override fun power(): Watt =
        Watt(1f)

    override fun netPrice(): Currency =
        Currency(2000f)

    override fun discountPrice(): Currency =
        Currency(1900f)
}