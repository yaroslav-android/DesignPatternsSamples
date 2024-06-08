package team.idivision.samples.designpatterns.factory

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.creational.builder.Builder
import team.idivision.samples.designpatterns.patterns.creational.fabric_method.FabricMethod
import team.idivision.samples.designpatterns.patterns.creational.singleton.Singleton


class CreationalPatternFactory : PatternFactory {

    override fun create(): List<Pattern> =
        listOf(
            FabricMethod(isPromotionNotification = false),
            team.idivision.samples.designpatterns.patterns.creational.abstract_factory.AbstractFactory(tier = team.idivision.samples.designpatterns.patterns.creational.abstract_factory.LootTier.Two),
            Builder(),
            Singleton(),
            team.idivision.samples.designpatterns.patterns.creational.prototype.Prototype(),
        )
}