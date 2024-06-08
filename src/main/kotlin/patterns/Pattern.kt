package team.idivision.samples.designpatterns.patterns

import team.idivision.samples.designpatterns.factory.PatternFactory


abstract class Pattern(val name: String) {
    abstract fun launch()
}

context(PrintablePattern<Pattern>)
fun launchGroup(
    group: PatternGroup,
    factory: PatternFactory,
) {
    println("\n> > > ${group.name} Patterns < < <\n")

    factory.create()
        .forEach { pattern ->
            pattern.print()
        }
}