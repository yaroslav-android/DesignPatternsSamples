package team.idivision.samples.designpatterns.patterns.behavioral.mediator.chat

import team.idivision.samples.designpatterns.patterns.behavioral.mediator.abstraction.ChatMediator
import team.idivision.samples.designpatterns.patterns.behavioral.mediator.abstraction.User


class ChatRoom : ChatMediator {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    override fun sendMessage(sender: User, msg: String) {
        users.forEach { user ->
            if (user != sender) {
                user.receiveMessage(msg)
            }
        }
    }
}