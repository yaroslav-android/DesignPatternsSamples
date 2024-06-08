package team.idivision.samples.designpatterns.patterns.creational.abstract_factory.mobs

import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.MobLoot


class ImpLoot : MobLoot {

    override fun getLootPool(): String =
        "Imp: loot[bottle, coin]"
}