package team.idivision.samples.designpatterns.creational.abstract_factory.mobs

import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.MobLoot

class ImpLoot : MobLoot {
    override fun lootPool() {
        println("Imp: loot[bottle, coin]")
    }
}