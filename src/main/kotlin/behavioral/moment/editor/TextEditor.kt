package team.idivision.samples.designpatterns.behavioral.moment.editor

import team.idivision.samples.designpatterns.behavioral.moment.data.EditorMemento


class TextEditor {
    private var currentDocument: String = ""

    fun setContent(content: String) {
        currentDocument = content
    }

    fun getContent(): String = currentDocument

    fun save(): EditorMemento = EditorMemento(currentDocument)

    fun restore(momento: EditorMemento) {
        currentDocument = momento.getState()
    }
}