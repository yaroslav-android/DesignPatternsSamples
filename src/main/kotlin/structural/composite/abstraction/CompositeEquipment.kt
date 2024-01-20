package team.idivision.samples.designpatterns.structural.composite.abstraction

import team.idivision.samples.designpatterns.structural.composite.util.Currency
import team.idivision.samples.designpatterns.structural.composite.util.Watt


abstract class CompositeEquipment(name: String) : Equipment(name) {
    private val equipmentList: MutableList<Equipment> = mutableListOf()

    override fun name(): String {
        val iterator = createIterator()

        val nameBuilder = StringBuilder()
        nameBuilder.appendLine(super.name())

        iterator.forEach { equipment ->
            nameBuilder.appendLine("- ${equipment.name()}")
        }

        return nameBuilder.toString()
    }

    override fun power(): Watt {
        val iterator = createIterator()

        var total = 0f
        iterator.forEach { equipment ->
            total += equipment.power().watt
        }

        return Watt(total)
    }

    override fun netPrice(): Currency {
        val iterator = createIterator()

        var total = 0f
        iterator.forEach { equipment ->
            total += equipment.netPrice().currency
        }

        return Currency(total)
    }

    override fun discountPrice(): Currency {
        val iterator = createIterator()

        var total = 0f
        iterator.forEach { equipment ->
            total += equipment.discountPrice().currency
        }

        return Currency(total)
    }

    fun createIterator(): ListIterator<Equipment> {
        if (equipmentList.isEmpty()) return emptyList<Equipment>().listIterator()

        return equipmentList.listIterator()
    }

    fun add(equipment: Equipment) {
        equipmentList.add(equipment)
    }

    fun remove(equipment: Equipment) {
        equipmentList.remove(equipment)
    }
}