class WhipCoffee(private val coffee: Coffee) : Coffee() {
    override fun getCost(): Int {
        return coffee.getCost() + 5
    }

    override fun getDescription(): String {
        return coffee.getDescription() + ", whip"
    }
}