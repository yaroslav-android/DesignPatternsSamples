package team.idivision.samples.designpatterns.behavioral.strategy

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.behavioral.strategy.abstraction.SortingStrategy
import team.idivision.samples.designpatterns.behavioral.strategy.model.Song
import team.idivision.samples.designpatterns.behavioral.strategy.playlist.PlaylistSorter
import team.idivision.samples.designpatterns.behavioral.strategy.sort.YearSortingStrategy

/** Use the Strategy pattern when
 *
 * Define a family of algorithms, encapsulate each one, and make them interchangeable.
 * Strategy lets the algorithm vary independently of clients that use it.
 *
 * - many related classes differ only in their behavior. Strategies provide a way to configure
 *      a class with one of many behaviors.
 * - you need different variants of an algorithm. For example, you might define algorithms reflecting
 *      different space/time trade-offs.Strategies can be used when these variants are implemented as
 *      a class hierarchy of algorithms.
 * - an algorithm uses data that clients shouldn't know about. Use theStrategy pattern to avoid exposing complex,
 *      algorithm-specific datastructures.
 * - a class defines many behaviors, and these appear as multiple conditional statements in its operations.
 *      Instead of many conditionals, move related conditional branches into their own Strategy class.
 */
class Strategy : Pattern("Strategy") {
    override fun launch() {
        val songs = listOf(
            Song("Song3", "Artist3", 2010),
            Song("Song1", "Artist1", 2005),
            Song("Song2", "Artist2", 2015),
        )

        val playlistSorter = PlaylistSorter(songs)

        // TitleSortingStrategy by default
        println(playlistSorter.sort())

        val strategy: SortingStrategy<Song> = YearSortingStrategy()
        playlistSorter.setStrategy(strategy)

        println(playlistSorter.sort())
    }
}