package team.idivision.samples.designpatterns.behavioral.visitor.packages

import team.idivision.samples.designpatterns.behavioral.visitor.abstraction.Package
import team.idivision.samples.designpatterns.behavioral.visitor.abstraction.PackageVisitor


class MediumBox(val weight: Float, val dimensions: Pair<Float, Float>) : Package {
    override fun accept(visitor: PackageVisitor) {
        visitor.visitMediumBox(this)
    }
}