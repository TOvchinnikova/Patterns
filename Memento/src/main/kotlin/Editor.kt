class Editor {
    var content: String = ""

    fun type(words: String)
    {
        content = "$content $words"
    }

//    fun getContent(): String
//    {
//        return content
//    }

    fun save(): EditorMemento
    {
        return EditorMemento(content)
    }

    fun restore(memento: EditorMemento)
    {
        content = memento.getContent()
    }
}