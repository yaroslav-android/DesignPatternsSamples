package team.idivision.samples.designpatterns.patterns.creational.abstract_factory

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.LootFactory
import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.factory.TierOneLootFactory
import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.factory.TierTwoLootFactory


/** Use the Abstract Factory pattern when
 *
 * Provide an interface for creating families of related or dependent objects
 * without specifying their concrete classes.
 *
 * - a system should be independent of how its products are created, composed, and represented.
 * - a system should be configured with one of multiple families of products.
 * - a family of related product objects is designed to be used together, and
 *      you need to enforce this constraint.
 * - you want to provide a class library of products, and you want to reveal just their interfaces,
 *      not their implementations.
 */
class AbstractFactory(
    private val tier: LootTier = LootTier.One
) : Pattern("AbstractFactory") {

    override fun launch() {
        val lootFactory: LootFactory = when (tier) {
            LootTier.One -> TierOneLootFactory()
            LootTier.Two -> TierTwoLootFactory()
        }

        val application = Application(lootFactory)
        application.printAvailableLootPool()
    }
}