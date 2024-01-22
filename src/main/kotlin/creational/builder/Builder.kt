package team.idivision.samples.designpatterns.creational.builder

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.creational.builder.menu.MenuBuilder
import team.idivision.samples.designpatterns.creational.builder.model.Salad
import team.idivision.samples.designpatterns.creational.builder.model.Soup


class Builder : Pattern("Builder") {

    override fun launch() {
        val menuBuilder: MenuBuilder = MenuBuilder()
            .setSoup(Soup.Borsch)
            .setSalad(Salad.Vegan)

        val menu = menuBuilder.toMenu()
        println(menu)
    }
}