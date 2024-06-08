package team.idivision.samples.designpatterns

import team.idivision.samples.designpatterns.factory.BehavioralPatternFactory
import team.idivision.samples.designpatterns.factory.CreationalPatternFactory
import team.idivision.samples.designpatterns.factory.PatternFactory
import team.idivision.samples.designpatterns.factory.StructuralPatternFactory
import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.PatternGroup
import team.idivision.samples.designpatterns.patterns.PrintablePattern
import team.idivision.samples.designpatterns.patterns.launchGroup


fun main() {
    val creationalPatterns: PatternFactory = CreationalPatternFactory()
    val structuralPatterns: PatternFactory = StructuralPatternFactory()
    val behavioralPatterns: PatternFactory = BehavioralPatternFactory()

    val printPatternScope = object : PrintablePattern<Pattern> {
        override fun Pattern.print() {
            println("--- START $name")
            launch()
            println("--- END $name\n")
        }
    }

    with(printPatternScope) {
        launchGroup(
            group = PatternGroup.Creational,
            factory = creationalPatterns,
        )

        launchGroup(
            group = PatternGroup.Structural,
            factory = structuralPatterns,
        )

        launchGroup(
            group = PatternGroup.Behavioral,
            factory = behavioralPatterns,
        )
    }
}