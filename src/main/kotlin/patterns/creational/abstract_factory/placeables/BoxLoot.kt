package team.idivision.samples.designpatterns.patterns.creational.abstract_factory.placeables

import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.PlaceableLoot


class BoxLoot : PlaceableLoot {

    override fun getLootPool(): String =
        "Box: loot[wood, coin]"
}