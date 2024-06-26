package team.idivision.samples.designpatterns.patterns.behavioral.observer.displays

import team.idivision.samples.designpatterns.patterns.behavioral.observer.abstraction.WeatherObserver


class CurrentConditionsDisplay(
    private var temperature: Float,
    private var humidity: Float,
) : WeatherObserver {

    override fun update(temperature: Float, humidity: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    private fun display() {
        println("Current condition: temperature=$temperature, humidity=$humidity")
    }
}