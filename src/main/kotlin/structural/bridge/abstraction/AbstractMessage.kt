package team.idivision.samples.designpatterns.structural.bridge.abstraction

abstract class AbstractMessage(
    protected val sender: MessageSender,
) {
    abstract fun sendMessage(msg: String)
}