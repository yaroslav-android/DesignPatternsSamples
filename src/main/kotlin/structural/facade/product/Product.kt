package team.idivision.samples.designpatterns.structural.facade.product


class Product {
    var details = ""

    fun getProductDetails(id: String) {
        println("Retrieve product details for $id")
        details = "Product: $id"
    }
}