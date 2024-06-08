package team.idivision.samples.designpatterns.patterns.behavioral.iterator.implementation

import team.idivision.samples.designpatterns.patterns.behavioral.iterator.abstraction.AbstractIterable
import team.idivision.samples.designpatterns.patterns.behavioral.iterator.abstraction.AbstractIterator


// Overhead of ArrayList, only for pattern demo purposes.
class CustomList<I> : ArrayList<I>(), AbstractIterable<I> {

    override fun getIterator(): AbstractIterator<I> = CustomIterator(this)

    private inner class CustomIterator<E>(private val root: CustomList<E>) : AbstractIterator<E> {
        private var cursor: Int = 0

        override fun hasNext(): Boolean = cursor != root.size

        override fun next(): E {
            val i = cursor

            if (i >= root.size) {
                throw IndexOutOfBoundsException(
                    "Current index $i for array size ${root.size} is out of bound."
                )
            }

            return root[i]
                .also { cursor = i + 1 }
        }
    }
}