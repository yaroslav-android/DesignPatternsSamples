package team.idivision.samples.designpatterns

import team.idivision.samples.designpatterns.creational.abstract_factory.AbstractFactory
import team.idivision.samples.designpatterns.creational.fabric_method.FabricMethod


fun main() {
    launchCreationalPatterns()
    // TODO: Behavioral
    // launchBehavioralPatterns()
    // TODO: Structural
    // launchStructuralPatterns()
}

private fun launchCreationalPatterns() {
    println("---------- Creational Patterns ----------")

    val patterns: List<Pattern> = listOf(
        FabricMethod(isPromotionNotification = false),
        AbstractFactory(tier = "t2"),
    )

    patterns.forEach { pattern ->
        println("\nPattern: ${pattern.name()}")
        pattern.launch()
    }
}