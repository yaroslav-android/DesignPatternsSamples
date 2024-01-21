package team.idivision.samples.designpatterns.structural.flyweight.factory

import team.idivision.samples.designpatterns.structural.flyweight.model.ShapeType
import team.idivision.samples.designpatterns.structural.flyweight.model.Shapes
import java.awt.Color


class ShapeFactory {
    private val shapes = mutableMapOf<String, ShapeType>()

    fun getRectType(color: Color): ShapeType {
        val shapeType = shapes.computeIfAbsent(Shapes.RECT + color) { key ->
            ShapeType(key, color)
        }
        return shapeType
    }

    fun getCircleType(color: Color): ShapeType {
        val shapeType = shapes.computeIfAbsent(Shapes.CIRCLE + color) { key ->
            ShapeType(key, color)
        }
        return shapeType
    }
}