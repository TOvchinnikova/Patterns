class TextEditor(private var state: WritingState) {

    fun setState(newState: WritingState)
    {
        state = newState
    }

    fun type(words: String)
    {
        state.write(words)
    }

}