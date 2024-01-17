package team.idivision.samples.designpatterns

import team.idivision.samples.designpatterns.creational.abstract_factory.AbstractFactory
import team.idivision.samples.designpatterns.creational.builder.Builder
import team.idivision.samples.designpatterns.creational.fabric_method.FabricMethod
import team.idivision.samples.designpatterns.structural.adapter.Adapter


fun main() {
    launchCreationalPatterns()
    launchStructuralPatterns()
    // TODO: Behavioral
    // launchBehavioralPatterns()
}

private fun launchCreationalPatterns() {
    println("---------- Creational Patterns ----------")

    val patterns: List<Pattern> = listOf(
        FabricMethod(isPromotionNotification = false),
        AbstractFactory(tier = "t2"),
        Builder(),
        // Singleton
        // Prototype
    )

    patterns.forEach { pattern ->
        println("\nPattern: ${pattern.name()}")
        pattern.launch()
    }
}

private fun launchStructuralPatterns() {
    println("---------- Structural Patterns ----------")

    val patterns: List<Pattern> = listOf(
        Adapter(),
    )

    patterns.forEach { pattern ->
        println("\nPattern: ${pattern.name()}")
        pattern.launch()
    }
}