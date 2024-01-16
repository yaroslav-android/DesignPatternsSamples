package team.idivision.samples.designpatterns.creational.abstract_factory.factory

import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.LootFactory
import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.MobLoot
import team.idivision.samples.designpatterns.creational.abstract_factory.abstraction.PlaceableLoot
import team.idivision.samples.designpatterns.creational.abstract_factory.mobs.ImpLoot
import team.idivision.samples.designpatterns.creational.abstract_factory.placeables.VaseLoot


class TierOneLootFactory : LootFactory {
    override fun createMobLoot(): MobLoot {
        return ImpLoot()
    }

    override fun createPlaceableLoot(): PlaceableLoot {
        return VaseLoot()
    }
}