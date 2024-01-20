package team.idivision.samples.designpatterns.structural.composite.abstraction

import team.idivision.samples.designpatterns.structural.composite.util.Currency
import team.idivision.samples.designpatterns.structural.composite.util.Watt


abstract class Equipment(
    private val name: String,
) {
    open fun name() = name

    abstract fun power(): Watt
    abstract fun netPrice(): Currency
    abstract fun discountPrice(): Currency
}