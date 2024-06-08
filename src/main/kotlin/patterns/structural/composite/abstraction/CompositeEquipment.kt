package team.idivision.samples.designpatterns.patterns.structural.composite.abstraction

import team.idivision.samples.designpatterns.patterns.structural.composite.util.Currency
import team.idivision.samples.designpatterns.patterns.structural.composite.util.Watt


abstract class CompositeEquipment(name: String) : Equipment(name) {
    private val equipmentList: MutableList<Equipment> = mutableListOf()

    override fun name(): String {
        val iterable = getIterable()

        val nameBuilder = StringBuilder()
        nameBuilder.appendLine(super.name())

        iterable.forEach { equipment ->
            nameBuilder.appendLine("- ${equipment.name()}")
        }

        return nameBuilder.toString()
    }

    override fun power(): Watt {
        val total = getIterable()
            .map { equipment -> equipment.power().watt }
            .sum()

        return Watt(total)
    }

    override fun netPrice(): Currency {
        val total = getIterable()
            .map { equipment -> equipment.netPrice().currency }
            .sum()

        return Currency(total)
    }

    override fun discountPrice(): Currency {
        val total = getIterable()
            .map { equipment -> equipment.discountPrice().currency }
            .sum()

        return Currency(total)
    }

    fun getIterable(): Iterable<Equipment> {
        if (equipmentList.isEmpty()) return emptyList()

        return equipmentList
    }

    fun add(equipment: Equipment) {
        equipmentList.add(equipment)
    }

    fun remove(equipment: Equipment) {
        equipmentList.remove(equipment)
    }
}