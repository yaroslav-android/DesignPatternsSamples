package team.idivision.samples.designpatterns.behavioral.moment

import team.idivision.samples.designpatterns.Pattern
import team.idivision.samples.designpatterns.behavioral.moment.editor.TextEditor
import team.idivision.samples.designpatterns.behavioral.moment.editor.UndoManager


class Momento : Pattern("Momento") {
    override fun launch() {
        val textEditor = TextEditor()
        val undoManager = UndoManager()

        textEditor.setContent("News daily")
        undoManager.saveState(textEditor)
        println("Current document: ${textEditor.getContent()}")

        textEditor.setContent("News weekly")
        undoManager.saveState(textEditor)
        println("Current document: ${textEditor.getContent()}")

        textEditor.setContent("News gone")
        undoManager.undo(textEditor)
        println("Current document: ${textEditor.getContent()}")
    }
}