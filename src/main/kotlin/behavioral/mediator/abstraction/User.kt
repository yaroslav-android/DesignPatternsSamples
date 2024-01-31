package team.idivision.samples.designpatterns.behavioral.mediator.abstraction


interface User {
    fun sendMessage(message: String)
    fun receiveMessage(message: String)
}