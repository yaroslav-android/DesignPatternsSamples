package team.idivision.samples.designpatterns.factory

import team.idivision.samples.designpatterns.patterns.Pattern


interface PatternFactory {
    fun create(): List<Pattern>
}