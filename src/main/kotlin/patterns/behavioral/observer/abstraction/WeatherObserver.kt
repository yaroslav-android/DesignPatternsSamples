package team.idivision.samples.designpatterns.patterns.behavioral.observer.abstraction


interface WeatherObserver {
    fun update(temperature: Float, humidity: Float)
}