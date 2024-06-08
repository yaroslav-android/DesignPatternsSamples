package team.idivision.samples.designpatterns.patterns.structural.facade.product


class Product {

    // nit: in production consider immutable over mutable.
    var details = ""

    fun getProductDetails(id: String) {
        println("Retrieve product details for $id")
        details = "Product: $id"
    }
}