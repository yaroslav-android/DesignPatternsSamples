package team.idivision.samples.designpatterns.behavioral.visitor.visitors

import team.idivision.samples.designpatterns.behavioral.visitor.abstraction.PackageVisitor
import team.idivision.samples.designpatterns.behavioral.visitor.abstraction.ShippingCost
import team.idivision.samples.designpatterns.behavioral.visitor.packages.LargeContainer
import team.idivision.samples.designpatterns.behavioral.visitor.packages.MediumBox
import team.idivision.samples.designpatterns.behavioral.visitor.packages.SmallParcel


class ShippingCostVisitor : PackageVisitor, ShippingCost {
    private var totalCost: Float = 0f

    override fun getCost(): Float = totalCost

    override fun visitSmallParcel(smallParcel: SmallParcel) {
        totalCost += smallParcel.weight * 1.25f
    }

    override fun visitMediumBox(mediumBox: MediumBox) {
        totalCost += mediumBox.weight * 2.10f
    }

    override fun visitLargeContainer(largeContainer: LargeContainer) {
        totalCost += largeContainer.weight * 3.5f
    }
}