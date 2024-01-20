package team.idivision.samples.designpatterns.structural.bridge

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.structural.bridge.abstraction.MessageSender
import team.idivision.samples.designpatterns.structural.bridge.message.LongMessage
import team.idivision.samples.designpatterns.structural.bridge.message.ShortMessage
import team.idivision.samples.designpatterns.structural.bridge.sender.EmailMessageSender
import team.idivision.samples.designpatterns.structural.bridge.sender.SenderType
import team.idivision.samples.designpatterns.structural.bridge.sender.SmsMessageSender

/** Use the Bridge pattern when
 *
 * Decouple an abstraction from its implementation so that the two can vary independently.
 *
 * - you want to avoid a permanent binding between an abstraction and its implementation.
 *      This might be the case, for example, when the implementation must be selected or switched at run-time.
 * - both the abstractions and their implementations should be extensible by subclassing.
 *      In this case, the Bridge pattern lets you combine the different abstractions
 *      and implementations and extend them independently.
 * - changes in the implementation of an abstraction should have no impact on clients; that is,
 *      their code should not have to be recompiled.
 * - (C++) you want to hide the implementation of an abstraction completely from clients.
 *      In C++ the representation of a class is visible in the class interface.
 * - you have a proliferation of classes as shown earlier in the first Motivation diagram.
 *      Such a class hierarchy indicates the need for splitting an object into two parts.
 *      Rumbaugh uses the term "nested generalizations" [RBP+91] to refer to such class hierarchies.
 * - you want to share an implementation among multiple objects (perhaps using reference counting),
 *      and this fact should be hidden from the client. A simple example is Coplien's String class [Cop92],
 *      in which multiple objects can share the same string representation (StringRep).
 */
class Bridge(
    private val senderType: SenderType = SenderType.SMS,
) : Pattern {
    override fun name(): String = "Bridge"

    override fun launch() {
        val sender: MessageSender = if (senderType == SenderType.EMAIL) {
            EmailMessageSender()
        } else {
            SmsMessageSender()
        }

        val message = if (senderType == SenderType.EMAIL) {
            LongMessage(sender)
        } else {
            ShortMessage(sender)
        }

        message.sendMessage("Pattern works fine.")
    }
}