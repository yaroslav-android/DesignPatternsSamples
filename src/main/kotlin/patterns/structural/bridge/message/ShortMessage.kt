package team.idivision.samples.designpatterns.patterns.structural.bridge.message

import team.idivision.samples.designpatterns.patterns.structural.bridge.abstraction.AbstractMessage
import team.idivision.samples.designpatterns.patterns.structural.bridge.abstraction.MessageSender


class ShortMessage(sender: MessageSender) : AbstractMessage(sender) {

    override fun sendMessage(msg: String) {
        val shortMessage = if (msg.length > 15) msg.take(15) else msg
        sender.sendMessage(shortMessage)
    }
}