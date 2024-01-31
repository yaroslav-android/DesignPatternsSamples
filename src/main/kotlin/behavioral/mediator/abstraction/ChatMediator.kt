package team.idivision.samples.designpatterns.behavioral.mediator.abstraction


interface ChatMediator {
    fun sendMessage(sender: User, msg: String)
}