package team.idivision.samples.designpatterns.patterns.structural.flyweight

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.structural.flyweight.canvas.Canvas
import team.idivision.samples.designpatterns.patterns.structural.flyweight.factory.ShapeFactory
import team.idivision.samples.designpatterns.patterns.structural.flyweight.model.Shape
import java.awt.Color


/** The Flyweight pattern's effectiveness depends heavily on how and where it's used.
 * Apply the Flyweight pattern when all the following are true:
 *
 * Use sharing to support large numbers of fine-grained objects efficiently.
 *
 * - An application uses a large number of objects.
 * - Storage costs are high because of the sheer quantity of objects.
 * - Most object state can be made extrinsic.
 * - Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed.
 * - The application doesn't depend on object identity. Since flyweight objects may be shared,
 *      identity tests will return true for conceptually distinct objects.
 */
class Flyweight : Pattern("Flyweight") {

    override fun launch() {
        val factory = ShapeFactory()

        val black = Color.red
        val white = Color.white

        val rectBlack = Shape(
            type = factory.getRectType(black),
            x = 0f,
            y = 1f,
        )
        val rectWhite = Shape(
            type = factory.getRectType(white),
            x = 0f,
            y = 1f,
        )

        val circleBlack = Shape(
            type = factory.getCircleType(black),
            x = 1f,
            y = 0f,
        )
        val circleWhite = Shape(
            type = factory.getCircleType(white),
            x = 1f,
            y = 0f,
        )

        val canvas = Canvas()
        canvas.drawRect(rectBlack.type.color, rectBlack.x, rectBlack.y)
        canvas.drawRect(rectWhite.type.color, rectWhite.x, rectWhite.y)
        canvas.drawCircle(circleBlack.type.color, circleBlack.x, circleBlack.y, 20f)
        canvas.drawCircle(circleWhite.type.color, circleWhite.x, circleWhite.y, 30f)
    }
}