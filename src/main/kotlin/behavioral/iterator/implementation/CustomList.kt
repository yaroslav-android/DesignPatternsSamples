package team.idivision.samples.designpatterns.behavioral.iterator.implementation

import team.idivision.samples.designpatterns.behavioral.iterator.abstraction.AbstractIterable
import team.idivision.samples.designpatterns.behavioral.iterator.abstraction.AbstractIterator


// Overhead of ArrayList, only for pattern demo purposes.
class CustomList<T> : ArrayList<T>(), AbstractIterable<T> {

    override fun getIterator(): AbstractIterator<T> = CustomIterator(this)

    private class CustomIterator<T>(private val root: CustomList<T>) : AbstractIterator<T> {
        private var cursor: Int = 0

        override fun hasNext(): Boolean = cursor != root.size

        override fun next(): T {
            val i = cursor

            if (i >= root.size) {
                throw IndexOutOfBoundsException("Current index $i for array size ${root.size} is out of bound.")
            }

            return root[i]
                .also { cursor = i + 1 }
        }

    }
}