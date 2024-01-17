package team.idivision.samples.designpatterns.creational.builder.menu

import team.idivision.samples.designpatterns.creational.builder.model.Salad
import team.idivision.samples.designpatterns.creational.builder.model.Soup


class MenuBuilder {
    private var soup: Soup = Soup.None
    private var salad: Salad = Salad.None

    fun setSoup(soup: Soup): MenuBuilder =
        this.apply { this.soup = soup }

    fun setSalad(salad: Salad): MenuBuilder =
        this.apply { this.salad = salad }

    fun toMenu(): Menu = Menu(soup, salad)
}