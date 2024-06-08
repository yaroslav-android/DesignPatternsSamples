package team.idivision.samples.designpatterns.patterns.structural.bridge.message

import team.idivision.samples.designpatterns.patterns.structural.bridge.abstraction.AbstractMessage
import team.idivision.samples.designpatterns.patterns.structural.bridge.abstraction.MessageSender


class LongMessage(sender: MessageSender) : AbstractMessage(sender) {

    override fun sendMessage(msg: String) {
        sender.sendMessage(msg)
    }
}