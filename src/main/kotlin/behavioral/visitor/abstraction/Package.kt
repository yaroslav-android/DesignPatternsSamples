package team.idivision.samples.designpatterns.behavioral.visitor.abstraction


interface Package {
    fun accept(visitor: PackageVisitor)
}