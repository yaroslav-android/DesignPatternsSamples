package team.idivision.samples.designpatterns.structural.composite

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.structural.composite.pc.*

/** Use the Composite pattern when
 * Compose objects into tree structures to represent part-whole hierarchies.
 * Composite lets clients treat individual objects and compositions of objects uniformly.
 *
 * - you want to represent part-whole hierarchies of objects.
 * - you want clients to be able to ignore the difference between compositions of objects and individual objects.
 *      Clients will treat all objects in the composite structure uniformly.
 */
class Composite : Pattern("Composite") {

    override fun launch() {
        val pc = Cabinet(name = "NZXT 510A")
        val motherboard = Motherboard(name = "Asus Gaming FX101i")

        motherboard.add(Ram(name = "Asus DDR5 16g"))
        motherboard.add(Cpu(name = "Intel Core i9 21000KF"))
        motherboard.add(Gpu(name = "Nvidia RTX 5090Ti"))

        pc.add(motherboard)

        pc.createIterator().forEach { equipment ->
            print("Component: ${equipment.name()}")
        }
        println("\nPrice: ${pc.netPrice().currency}")
        println("Energy consumption: ${pc.power().watt}")
    }
}