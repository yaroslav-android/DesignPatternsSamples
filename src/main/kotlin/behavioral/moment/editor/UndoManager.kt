package team.idivision.samples.designpatterns.behavioral.moment.editor

import team.idivision.samples.designpatterns.behavioral.moment.data.EditorMemento


class UndoManager {
    private val history = ArrayDeque<EditorMemento>()

    fun saveState(editor: TextEditor) {
        val state = editor.save()
        history.addLast(state)
    }

    fun undo(editor: TextEditor) {
        if (history.isNotEmpty()) {
            val state = history.removeLast()
            editor.restore(state)
        }
    }
}