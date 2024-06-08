package team.idivision.samples.designpatterns.patterns.creational.abstract_factory


sealed interface LootTier {
    data object One : LootTier
    data object Two : LootTier
}
