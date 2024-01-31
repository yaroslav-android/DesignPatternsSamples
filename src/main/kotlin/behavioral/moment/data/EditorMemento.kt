package team.idivision.samples.designpatterns.behavioral.moment.data


class EditorMemento(
    private val documentState: String
) {
    fun getState(): String = documentState
}