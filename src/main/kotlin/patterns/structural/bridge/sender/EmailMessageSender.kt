package team.idivision.samples.designpatterns.patterns.structural.bridge.sender

import team.idivision.samples.designpatterns.patterns.structural.bridge.abstraction.MessageSender


class EmailMessageSender : MessageSender {

    override fun sendMessage(msg: String) {
        println("Send by email: $msg")
    }
}