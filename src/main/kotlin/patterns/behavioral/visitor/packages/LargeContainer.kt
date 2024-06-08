package team.idivision.samples.designpatterns.patterns.behavioral.visitor.packages

import team.idivision.samples.designpatterns.patterns.behavioral.visitor.abstraction.Package
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.abstraction.PackageVisitor


class LargeContainer(val weight: Float, val dimensions: Triple<Float, Float, Float>) : Package {

    override fun accept(visitor: PackageVisitor) {
        visitor.visitLargeContainer(this)
    }
}