package team.idivision.samples.designpatterns.patterns.creational.builder.menu

import team.idivision.samples.designpatterns.patterns.creational.builder.model.Salad
import team.idivision.samples.designpatterns.patterns.creational.builder.model.Soup


class MenuBuilder {
    private var soup: Soup = Soup.None
    private var salad: Salad = Salad.None

    fun setSoup(soup: Soup): MenuBuilder =
        apply { this.soup = soup }

    fun setSalad(salad: Salad): MenuBuilder =
        apply { this.salad = salad }

    fun build(): Menu =
        Menu(soup, salad)
}