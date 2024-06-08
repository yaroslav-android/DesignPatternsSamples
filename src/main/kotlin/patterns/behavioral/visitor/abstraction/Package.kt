package team.idivision.samples.designpatterns.patterns.behavioral.visitor.abstraction


interface Package {
    fun accept(visitor: PackageVisitor)
}