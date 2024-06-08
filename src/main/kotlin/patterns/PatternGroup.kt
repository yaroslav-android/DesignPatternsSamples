package team.idivision.samples.designpatterns.patterns


sealed class PatternGroup(val name: String) {
    data object Creational : PatternGroup("Creational")
    data object Structural : PatternGroup("Structural")
    data object Behavioral : PatternGroup("Behavioral")
}
