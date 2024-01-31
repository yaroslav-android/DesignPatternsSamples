package team.idivision.samples.designpatterns

import team.idivision.samples.designpatterns.behavioral.chain_of_responsibility.ChainOfResponsibility
import team.idivision.samples.designpatterns.behavioral.command.Command
import team.idivision.samples.designpatterns.behavioral.mediator.Mediator
import team.idivision.samples.designpatterns.behavioral.moment.Momento
import team.idivision.samples.designpatterns.behavioral.observer.Observer
import team.idivision.samples.designpatterns.behavioral.state.State
import team.idivision.samples.designpatterns.creational.abstract_factory.AbstractFactory
import team.idivision.samples.designpatterns.creational.builder.Builder
import team.idivision.samples.designpatterns.creational.fabric_method.FabricMethod
import team.idivision.samples.designpatterns.creational.prototype.Prototype
import team.idivision.samples.designpatterns.creational.singleton.Singleton
import team.idivision.samples.designpatterns.structural.adapter.Adapter
import team.idivision.samples.designpatterns.structural.bridge.Bridge
import team.idivision.samples.designpatterns.structural.bridge.sender.SenderType
import team.idivision.samples.designpatterns.structural.composite.Composite
import team.idivision.samples.designpatterns.structural.decorator.Decorator
import team.idivision.samples.designpatterns.structural.facade.Facade
import team.idivision.samples.designpatterns.structural.flyweight.Flyweight
import team.idivision.samples.designpatterns.structural.proxy.Proxy
import team.idivision.samples.designpatterns.behavioral.iterator.Iterator as IteratorPattern


fun main() {
    launchCreationalPatterns()
    launchStructuralPatterns()
    launchBehavioralPatterns()

    // TODO: Add for each pattern documentation on how each combines.
}

private fun launchPatterns(
    group: String,
    patterns: List<Pattern>,
) {
    println("\n---------- $group Patterns ----------")

    patterns.forEach { pattern ->
        println("\nPattern: ${pattern.name}")
        pattern.launch()
    }
}

private fun launchCreationalPatterns() {
    launchPatterns(
        group = "Creational",
        patterns = listOf(
            FabricMethod(isPromotionNotification = false),
            AbstractFactory(tier = "t2"),
            Builder(),
            Singleton(),
            Prototype(),
        ),
    )
}

private fun launchStructuralPatterns() {
    launchPatterns(
        group = "Structural",
        patterns = listOf(
            Adapter(),
            Bridge(senderType = SenderType.EMAIL),
            Composite(),
            Decorator(),
            Facade(),
            Flyweight(),
            Proxy()
        ),
    )
}

private fun launchBehavioralPatterns() {
    launchPatterns(
        group = "Behavioral",
        patterns = listOf(
            ChainOfResponsibility(),
            Command(),
            IteratorPattern(),
            Mediator(),
            Momento(),
            Observer(),
            State(),
        ),
    )
}