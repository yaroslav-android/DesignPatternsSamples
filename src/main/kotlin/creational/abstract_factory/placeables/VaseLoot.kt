package team.idivision.samples.designpatterns.creational.abstract_factory.placeables

import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.PlaceableLoot

class VaseLoot : PlaceableLoot {
    override fun lootPool() {
        println("Vase: loot[branch, coin]")
    }
}