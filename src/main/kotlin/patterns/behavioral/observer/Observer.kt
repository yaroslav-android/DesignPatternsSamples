package team.idivision.samples.designpatterns.patterns.behavioral.observer

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.behavioral.observer.displays.CurrentConditionsDisplay
import team.idivision.samples.designpatterns.patterns.behavioral.observer.displays.ForecastDisplay
import team.idivision.samples.designpatterns.patterns.behavioral.observer.station.WeatherStation


/** Use the Observer pattern in any of the following situations
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 *
 * - When an abstraction has two aspects, one dependent on the other.
 *      Encapsulating these aspects in separate objects lets you vary and reuse them independently.
 * - When a change to one object requires changing others, and you don't know how many objects need to be changed.
 * - When an object should be able to notify other objects without making assumptions
 *      about whom these objects are. In other words, you don't want these objects tightly coupled.
 */
class Observer : Pattern("Observer") {

    override fun launch() {
        val currentTemperature = 10f
        val currentHumidity = 20f

        val currentDisplay = CurrentConditionsDisplay(
            temperature = currentTemperature,
            humidity = currentHumidity,
        )

        val forecastDisplay = ForecastDisplay(
            delta = 1.5f,
            temperature = currentTemperature,
            humidity = currentHumidity,
        )

        val station = WeatherStation(
            temperature = currentTemperature,
            humidity = currentHumidity,
        )

        station.addObserver(currentDisplay)
        station.addObserver(forecastDisplay)
        station.notifyObservers()

        station.updateMeasurements(temperature = 11.0f, humidity = 19.0f)
    }
}