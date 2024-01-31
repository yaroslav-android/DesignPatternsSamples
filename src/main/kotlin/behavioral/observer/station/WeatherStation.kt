package team.idivision.samples.designpatterns.behavioral.observer.station

import team.idivision.samples.designpatterns.behavioral.observer.abstraction.WeatherObserver


class WeatherStation(
    private var temperature: Float,
    private var humidity: Float,
) {
    private val observers = mutableListOf<WeatherObserver>()

    fun addObserver(observer: WeatherObserver) {
        observers.add(observer)
    }

    fun removeObserver(observer: WeatherObserver) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        observers.forEach { it.update(temperature, humidity) }
    }

    fun updateMeasurements(temperature: Float, humidity: Float) {
        this.temperature = temperature
        this.humidity = humidity

        notifyObservers()
    }
}