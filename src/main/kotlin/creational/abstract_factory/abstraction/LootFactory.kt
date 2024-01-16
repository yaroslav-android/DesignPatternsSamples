package team.idivision.samples.designpatterns.creational.abstract_factory.abstraction


interface LootFactory {
    fun createMobLoot(): MobLoot
    fun createPlaceableLoot(): PlaceableLoot
}