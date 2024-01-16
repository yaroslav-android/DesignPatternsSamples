package team.idivision.samples.designpatterns.creational.abstract_factory

import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.LootFactory
import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.MobLoot
import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.PlaceableLoot


class Application(factory: LootFactory) {
    private val mobLoot: MobLoot = factory.createMobLoot()
    private val placeableLoot: PlaceableLoot = factory.createPlaceableLoot()

    fun lootPool() {
        mobLoot.lootPool()
        placeableLoot.lootPool()
    }
}