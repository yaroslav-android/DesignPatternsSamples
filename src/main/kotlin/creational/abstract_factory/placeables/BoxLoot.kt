package team.idivision.samples.designpatterns.creational.abstract_factory.placeables

import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.PlaceableLoot

class BoxLoot : PlaceableLoot {
    override fun lootPool() {
        println("Box: loot[wood, coin]")
    }
}