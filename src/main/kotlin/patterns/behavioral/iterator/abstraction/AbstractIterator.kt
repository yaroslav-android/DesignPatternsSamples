package team.idivision.samples.designpatterns.patterns.behavioral.iterator.abstraction


interface AbstractIterator<E> {
    fun hasNext(): Boolean

    @Throws(IndexOutOfBoundsException::class)
    fun next(): E
}