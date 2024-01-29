package team.idivision.samples.designpatterns.behavioral.iterator.abstraction


interface AbstractIterable<E> {
    fun getIterator(): AbstractIterator<E>
}