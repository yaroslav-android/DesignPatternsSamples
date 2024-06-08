package team.idivision.samples.designpatterns.patterns.behavioral.visitor.packages

import team.idivision.samples.designpatterns.patterns.behavioral.visitor.abstraction.Package
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.abstraction.PackageVisitor


class MediumBox(val weight: Float, val dimensions: Pair<Float, Float>) : Package {

    override fun accept(visitor: PackageVisitor) {
        visitor.visitMediumBox(this)
    }
}