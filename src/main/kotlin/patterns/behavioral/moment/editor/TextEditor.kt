package team.idivision.samples.designpatterns.patterns.behavioral.moment.editor

import team.idivision.samples.designpatterns.patterns.behavioral.moment.data.EditorMemento


class TextEditor {
    private var currentDocument: String? = null

    fun setContent(content: String) {
        currentDocument = content
    }

    fun getContent(): String? = currentDocument

    fun save(): EditorMemento = EditorMemento(currentDocument)

    fun restore(momento: EditorMemento?) {
        if (momento == null) {
            currentDocument = null
            return
        }

        currentDocument = momento.getState()
    }
}