package team.idivision.samples.designpatterns.patterns.behavioral.strategy.abstraction


interface SortingStrategy<T> {
    fun sort(items: List<T>): List<T>
}