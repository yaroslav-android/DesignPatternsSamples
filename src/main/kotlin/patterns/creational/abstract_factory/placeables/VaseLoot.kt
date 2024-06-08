package team.idivision.samples.designpatterns.patterns.creational.abstract_factory.placeables

import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.PlaceableLoot


class VaseLoot : PlaceableLoot {

    override fun getLootPool(): String =
        "Vase: loot[branch, coin]"
}