package team.idivision.samples.designpatterns.patterns.behavioral.strategy.playlist

import team.idivision.samples.designpatterns.patterns.behavioral.strategy.abstraction.SortingStrategy
import team.idivision.samples.designpatterns.patterns.behavioral.strategy.model.Song
import team.idivision.samples.designpatterns.patterns.behavioral.strategy.sort.TitleSortingStrategy


class PlaylistSorter(private val songs: List<Song>) {
    private var sortingStrategy: SortingStrategy<Song> =
        TitleSortingStrategy()

    fun sort(): List<Song> =
        sortingStrategy.sort(songs)

    fun setStrategy(strategy: SortingStrategy<Song>) {
        sortingStrategy = strategy
    }
}