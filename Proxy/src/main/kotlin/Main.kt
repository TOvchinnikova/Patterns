
fun main() {
    val door = Security(LabDoor())
    door.open("123")
    door.open("qwerty")
    door.close()
}