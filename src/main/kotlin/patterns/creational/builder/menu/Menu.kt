package team.idivision.samples.designpatterns.patterns.creational.builder.menu

import team.idivision.samples.designpatterns.patterns.creational.builder.model.Salad
import team.idivision.samples.designpatterns.patterns.creational.builder.model.Soup


data class Menu(
    val soup: Soup,
    val salad: Salad,
)