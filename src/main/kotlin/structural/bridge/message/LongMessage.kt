package team.idivision.samples.designpatterns.structural.bridge.message

import team.idivision.samples.designpatterns.structural.bridge.abstraction.AbstractMessage
import team.idivision.samples.designpatterns.structural.bridge.abstraction.MessageSender


class LongMessage(sender: MessageSender) : AbstractMessage(sender = sender) {
    override fun sendMessage(msg: String) {
        sender.sendMessage(msg)
    }
}