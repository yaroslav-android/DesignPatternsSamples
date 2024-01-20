package team.idivision.samples.designpatterns.structural.facade

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.structural.facade.order.Order
import team.idivision.samples.designpatterns.structural.facade.user.User


class Facade : Pattern {
    override fun name(): String = "Facade"

    override fun launch() {
        val user = User(email = "user@example.com")

        val order = Order(user)
        order.create("FAKEPRODUCT_ID")
    }
}