package team.idivision.samples.designpatterns

interface Pattern/*(val name: String)*/ {

    @Deprecated("make abstract class with constructor")
    fun name(): String
    fun launch()
}