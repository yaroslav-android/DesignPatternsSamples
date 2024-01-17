package team.idivision.samples.designpatterns.creational.builder.model

sealed class Soup(val name: String) {
    data object Borsch : Soup("borsch")
    data object Solyanka : Soup("solyanka")
    data object None : Soup("without-soup")
}