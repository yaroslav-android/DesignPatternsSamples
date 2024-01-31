package team.idivision.samples.designpatterns.behavioral.observer.displays

import team.idivision.samples.designpatterns.behavioral.observer.abstraction.WeatherObserver


class ForecastDisplay(
    private val delta: Float,
    private var temperature: Float,
    private var humidity: Float,
) : WeatherObserver {

    override fun update(temperature: Float, humidity: Float) {
        this.temperature = temperature + delta
        this.humidity = humidity + delta
        display()
    }

    fun display() {
        println("Forecast condition: temperature=$temperature, humidity=$humidity")
    }
}