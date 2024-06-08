package team.idivision.samples.designpatterns.patterns.creational.builder.model


sealed class Soup(val name: String) {
    data object None : Soup("without-soup")
    data object Borsch : Soup("borsch")
    data object Solyanka : Soup("solyanka")
}