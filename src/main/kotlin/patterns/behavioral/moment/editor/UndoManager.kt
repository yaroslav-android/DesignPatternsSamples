package team.idivision.samples.designpatterns.patterns.behavioral.moment.editor

import team.idivision.samples.designpatterns.patterns.behavioral.moment.data.EditorMemento


class UndoManager {
    private val history = ArrayDeque<EditorMemento>()

    fun saveState(editor: TextEditor) {
        val state = editor.save()
        history.addLast(state)
    }

    fun undo(editor: TextEditor): Boolean {
        if (history.isEmpty()) {
            return false
        }

        history.removeLast()

        // double check since with removed last
        if (history.isEmpty()) {
            editor.restore(null)
            return true
        }

        val state = history.last()
        editor.restore(state)

        return true
    }
}