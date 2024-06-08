package team.idivision.samples.designpatterns.patterns.creational.abstract_factory.mobs

import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.MobLoot


class WolfLoot : MobLoot {

    override fun getLootPool(): String =
        "Wolf: loot[hide, bones]"
}