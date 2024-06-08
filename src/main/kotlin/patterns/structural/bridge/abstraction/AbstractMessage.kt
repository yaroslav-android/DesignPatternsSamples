package team.idivision.samples.designpatterns.patterns.structural.bridge.abstraction


abstract class AbstractMessage(protected val sender: MessageSender) {
    abstract fun sendMessage(msg: String)
}