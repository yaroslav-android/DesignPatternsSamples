package team.idivision.samples.designpatterns

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
    )

    patterns.forEach { pattern ->
        println("Pattern: ${pattern.name()}")
        pattern.launch()
    }
}