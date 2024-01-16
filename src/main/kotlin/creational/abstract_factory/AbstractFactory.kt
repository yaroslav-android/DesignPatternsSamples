package team.idivision.samples.designpatterns.creational.abstract_factory

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.LootFactory
import team.idivision.samples.designpatterns.creational.abstract_factory.factory.TierOneLootFactory
import team.idivision.samples.designpatterns.creational.abstract_factory.factory.TierTwoLootFactory


class AbstractFactory(
    private val tier: String = "t1"
) : Pattern {
    override fun name(): String = "AbstractFactory"

    override fun launch() {
        val lootFactory: LootFactory = if (tier == "t1") {
            TierOneLootFactory()
        } else {
            TierTwoLootFactory()
        }

        val application = Application(lootFactory)
        application.lootPool()
    }
}