package team.idivision.samples.designpatterns.behavioral.strategy.sort

import team.idivision.samples.designpatterns.behavioral.strategy.abstraction.SortingStrategy
import team.idivision.samples.designpatterns.behavioral.strategy.model.Song


class TitleSortingStrategy : SortingStrategy<Song> {
    override fun sort(items: List<Song>): List<Song> = items.sortedBy { it.name }
}