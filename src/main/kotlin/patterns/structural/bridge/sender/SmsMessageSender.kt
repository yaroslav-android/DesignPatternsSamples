package team.idivision.samples.designpatterns.patterns.structural.bridge.sender

import team.idivision.samples.designpatterns.patterns.structural.bridge.abstraction.MessageSender


class SmsMessageSender : MessageSender {

    override fun sendMessage(msg: String) {
        println("Send by sms: $msg")
    }
}