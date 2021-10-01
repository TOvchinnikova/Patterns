fun main() {
    val editor = TextEditor(Default())
    editor.type("First line")
    editor.setState(UpperCase())
    editor.type("Second line")
    editor.type("Third line")
    editor.setState(LowerCase())
    editor.type("Fourth line")
    editor.type("Fifth line")
}