package team.idivision.samples.designpatterns.patterns.behavioral.mediator.abstraction


interface User {
    fun sendMessage(message: String)
    fun receiveMessage(message: String)
}