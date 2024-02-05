package team.idivision.samples.designpatterns.behavioral.visitor.abstraction

import team.idivision.samples.designpatterns.behavioral.visitor.packages.LargeContainer
import team.idivision.samples.designpatterns.behavioral.visitor.packages.MediumBox
import team.idivision.samples.designpatterns.behavioral.visitor.packages.SmallParcel


interface PackageVisitor {
    fun visitSmallParcel(smallParcel: SmallParcel)
    fun visitMediumBox(mediumBox: MediumBox)
    fun visitLargeContainer(largeContainer: LargeContainer)
}