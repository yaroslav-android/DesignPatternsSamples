package team.idivision.samples.designpatterns.behavioral.mediator

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.behavioral.mediator.chat.ChatRoom
import team.idivision.samples.designpatterns.behavioral.mediator.model.ChatUser

/** Use the Mediator pattern when
 * Define an object that encapsulates how a set of objects interact.Mediator promotes loose coupling
 * by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
 *
 * - a set of objects communicate in well-defined but complex ways.
 *      The resulting interdependencies are unstructured and difficult to understand.
 * - reusing an object is difficult because it refers to and communicates with many other objects.
 * - a behavior that's distributed between several classes should be customizable without a lot of subclassing.
 */
class Mediator : Pattern("Mediator") {
    override fun launch() {
        val chatRoom = ChatRoom()

        val user1 = ChatUser(
            name = "Jack",
            chatMediator = chatRoom,
        ).also { chatRoom.addUser(it) }

        val user2 = ChatUser(
            name = "Mike",
            chatMediator = chatRoom,
        ).also { chatRoom.addUser(it) }

        user1.sendMessage("Hey")
        user2.sendMessage("Hello")
    }
}