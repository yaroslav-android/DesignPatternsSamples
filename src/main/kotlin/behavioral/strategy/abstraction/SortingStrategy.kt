package team.idivision.samples.designpatterns.behavioral.strategy.abstraction


interface SortingStrategy<T> {
    fun sort(items: List<T>): List<T>
}