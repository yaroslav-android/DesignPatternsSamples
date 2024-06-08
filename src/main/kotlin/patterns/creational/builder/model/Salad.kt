package team.idivision.samples.designpatterns.patterns.creational.builder.model


sealed class Salad(val name: String) {
    data object None : Salad("without-salad")
    data object Greek : Salad("greek")
    data object Vegan : Salad("vegan")
}
