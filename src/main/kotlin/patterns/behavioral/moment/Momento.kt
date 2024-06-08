package team.idivision.samples.designpatterns.patterns.behavioral.moment

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.behavioral.moment.editor.TextEditor
import team.idivision.samples.designpatterns.patterns.behavioral.moment.editor.UndoManager


/** Use the Memento pattern when
 * Without violating encapsulation, capture and externalize an object's internal state
 * so that the object can be restored to this state later.
 *
 * - a snapshot of (some portion of) an object's state must be saved so that it
 *      can be restored to that state later, and
 * - a direct interface to obtaining the state would expose implementation
 *      details and break the object's encapsulation.
 */
class Momento : Pattern("Momento") {

    override fun launch() {
        val textEditor = TextEditor()
        val undoManager = UndoManager()

        textEditor.setContent("News daily")
        undoManager.saveState(textEditor)
        printDocument(textEditor)

        textEditor.setContent("News weekly")
        undoManager.saveState(textEditor)
        printDocument(textEditor)

        textEditor.setContent("News gone")
        undoManager.saveState(textEditor)
        printDocument(textEditor)

        if (undoManager.undo(textEditor)) {
            printDocument(textEditor)
        }
    }

    private fun printDocument(textEditor: TextEditor) {
        println("Current document: ${textEditor.getContent()}")
    }
}