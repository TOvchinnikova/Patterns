class SimpleCoffee : Coffee() {
    override fun getCost(): Int {
        return 10
    }

    override fun getDescription(): String {
        return "Simple coffee"
    }
}