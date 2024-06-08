package team.idivision.samples.designpatterns.patterns.creational.abstract_factory

import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.LootFactory


class Application(private val factory: LootFactory) {

    fun printAvailableLootPool() {
        val mobLoot = factory.createMobLoot()
        val placeableLoot = factory.createPlaceableLoot()

        val mobLootPool = mobLoot.getLootPool()
        val placeableLootPool = placeableLoot.getLootPool()

        println(mobLootPool)
        println(placeableLootPool)
    }
}