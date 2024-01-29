package team.idivision.samples.designpatterns.behavioral.iterator.abstraction

interface AbstractIterator<E> {
    fun hasNext(): Boolean
    fun next(): E
}