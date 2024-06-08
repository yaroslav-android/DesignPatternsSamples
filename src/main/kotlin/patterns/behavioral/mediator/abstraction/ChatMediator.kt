package team.idivision.samples.designpatterns.patterns.behavioral.mediator.abstraction


interface ChatMediator {
    fun sendMessage(sender: User, msg: String)
}