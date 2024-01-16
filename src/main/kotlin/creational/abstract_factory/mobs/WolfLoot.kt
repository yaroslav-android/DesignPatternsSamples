package team.idivision.samples.designpatterns.creational.abstract_factory.mobs

import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.MobLoot

class WolfLoot : MobLoot {
    override fun lootPool() {
        println("Wolf: loot[hide, bones]")
    }
}