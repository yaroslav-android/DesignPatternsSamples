package team.idivision.samples.designpatterns.patterns.behavioral.visitor.visitors

import team.idivision.samples.designpatterns.patterns.behavioral.visitor.abstraction.PackageVisitor
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.abstraction.ShippingCost
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.packages.LargeContainer
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.packages.MediumBox
import team.idivision.samples.designpatterns.patterns.behavioral.visitor.packages.SmallParcel


class ShippingCostVisitor : PackageVisitor, ShippingCost {
    private var totalCost: Float = 0f

    override fun getCost(): Float = totalCost

    override fun visitSmallParcel(smallParcel: SmallParcel) {
        totalCost += smallParcel.weight * 1.25f
    }

    override fun visitMediumBox(mediumBox: MediumBox) {
        totalCost += (mediumBox.weight + mediumBox.dimensions.first + mediumBox.dimensions.second) * 2.10f
    }

    override fun visitLargeContainer(largeContainer: LargeContainer) {
        totalCost += (largeContainer.weight + largeContainer.dimensions.first + largeContainer.dimensions.second + largeContainer.dimensions.third) * 3.5f
    }
}