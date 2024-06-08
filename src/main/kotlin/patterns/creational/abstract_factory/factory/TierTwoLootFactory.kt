package team.idivision.samples.designpatterns.patterns.creational.abstract_factory.factory

import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.LootFactory
import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.MobLoot
import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.abstraction.PlaceableLoot
import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.mobs.WolfLoot
import team.idivision.samples.designpatterns.patterns.creational.abstract_factory.placeables.BoxLoot


class TierTwoLootFactory : LootFactory {

    override fun createMobLoot(): MobLoot {
        return WolfLoot()
    }

    override fun createPlaceableLoot(): PlaceableLoot {
        return BoxLoot()
    }
}