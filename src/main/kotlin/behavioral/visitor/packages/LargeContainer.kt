package team.idivision.samples.designpatterns.behavioral.visitor.packages

import team.idivision.samples.designpatterns.behavioral.visitor.abstraction.Package
import team.idivision.samples.designpatterns.behavioral.visitor.abstraction.PackageVisitor


class LargeContainer(val weight: Float, val dimensions: Triple<Float, Float, Float>) : Package {
    override fun accept(visitor: PackageVisitor) {
        visitor.visitLargeContainer(this)
    }
}