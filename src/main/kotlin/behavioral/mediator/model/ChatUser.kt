package team.idivision.samples.designpatterns.behavioral.mediator.model

import team.idivision.samples.designpatterns.behavioral.mediator.abstraction.ChatMediator
import team.idivision.samples.designpatterns.behavioral.mediator.abstraction.User


data class ChatUser(
    val name: String,
    val chatMediator: ChatMediator,
) : User {

    override fun sendMessage(message: String) {
        println("$name sent: $message")
        chatMediator.sendMessage(this, message)
    }

    override fun receiveMessage(message: String) {
        println("$name received: $message")
    }
}
