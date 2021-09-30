fun main() {
    val editor = Editor()
    editor.type("This is the first sentence.")
    editor.type("This is second.")

    // Сохранение состояния в: This is the first sentence. This is second.
    val saved = editor.save()
    editor.type("And this is third.")
    println(editor.content)
    
    // Восстанавливаем последнее сохранённое состояние
    editor.restore(saved)
    println(editor.content)
}