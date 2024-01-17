package team.idivision.samples.designpatterns.creational.builder.model

sealed class Salad(val name: String) {
    data object Greek : Salad("greek")
    data object Vegan : Salad("vegan")
    data object None : Salad("without-salad")
}
