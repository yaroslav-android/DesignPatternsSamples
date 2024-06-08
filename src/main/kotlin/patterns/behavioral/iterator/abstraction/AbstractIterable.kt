package team.idivision.samples.designpatterns.patterns.behavioral.iterator.abstraction


interface AbstractIterable<I> {
    fun getIterator(): AbstractIterator<I>
}