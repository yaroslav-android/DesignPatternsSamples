package team.idivision.samples.designpatterns.behavioral.visitor.packages

import team.idivision.samples.designpatterns.behavioral.visitor.abstraction.Package
import team.idivision.samples.designpatterns.behavioral.visitor.abstraction.PackageVisitor


class SmallParcel(val weight: Float) : Package {
    override fun accept(visitor: PackageVisitor) {
        visitor.visitSmallParcel(this)
    }
}