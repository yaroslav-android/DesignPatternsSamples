package team.idivision.samples.designpatterns.patterns.behavioral.visitor.abstraction

import team.idivision.samples.designpatterns.patterns.behavioral.visitor.packages.LargeContainer
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.packages.MediumBox
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.packages.SmallParcel


interface PackageVisitor {
    fun visitSmallParcel(smallParcel: SmallParcel)
    fun visitMediumBox(mediumBox: MediumBox)
    fun visitLargeContainer(largeContainer: LargeContainer)
}