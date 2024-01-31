package team.idivision.samples.designpatterns.behavioral.observer.abstraction


interface WeatherObserver {
    fun update(temperature: Float, humidity: Float)
}