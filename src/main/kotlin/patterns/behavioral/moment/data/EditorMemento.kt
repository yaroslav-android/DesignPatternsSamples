package team.idivision.samples.designpatterns.patterns.behavioral.moment.data


data class EditorMemento(private val documentState: String?) {
    fun getState(): String? = documentState
}