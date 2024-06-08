package team.idivision.samples.designpatterns.factory

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.structural.adapter.Adapter
import team.idivision.samples.designpatterns.patterns.structural.bridge.Bridge
import team.idivision.samples.designpatterns.patterns.structural.bridge.sender.SenderType
import team.idivision.samples.designpatterns.patterns.structural.decorator.Decorator
import team.idivision.samples.designpatterns.patterns.structural.facade.Facade
import team.idivision.samples.designpatterns.patterns.structural.flyweight.Flyweight
import team.idivision.samples.designpatterns.patterns.structural.proxy.Proxy


class StructuralPatternFactory : PatternFactory {

    override fun create(): List<Pattern> =
        listOf(
            Adapter(),
            Bridge(senderType = SenderType.EMAIL),
            team.idivision.samples.designpatterns.patterns.structural.composite.Composite(),
            Decorator(),
            Facade(),
            Flyweight(),
            Proxy()
        )
}