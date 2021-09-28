class Security(private val door: Door) {

    fun open(password: String) {
        if (authenticate(password)) {
            door.open()
        } else {
            println("Big no! It ain't possible.")
        }
    }

    private fun authenticate(password: String): Boolean {
        return password == "qwerty"
    }

    fun close() {
        door.close()
    }
}