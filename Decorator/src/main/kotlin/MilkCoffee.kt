class MilkCoffee(private val coffee: Coffee) : Coffee() {

    override fun getCost(): Int {
        return coffee.getCost() + 2
    }

    override fun getDescription(): String {
        return coffee.getDescription() + ", milk"
    }
}