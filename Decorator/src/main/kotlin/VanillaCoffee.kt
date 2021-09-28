class VanillaCoffee(private val coffee: Coffee) : Coffee() {
    override fun getCost(): Int {
        return coffee.getCost() + 3
    }

    override fun getDescription(): String {
        return coffee.getDescription() + ", vanilla"
    }
}