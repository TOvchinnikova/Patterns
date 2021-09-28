fun main() {
    val someCoffee = SimpleCoffee()
    println("Simple coffee: cost ${someCoffee.getCost()}, description ${someCoffee.getDescription()}")
    val coffeeWithMilk = MilkCoffee(someCoffee)
    println("Milk coffee: cost ${coffeeWithMilk.getCost()}, description ${coffeeWithMilk.getDescription()}")
    val coffeeWithMilkAndWhip = WhipCoffee(coffeeWithMilk)
    println("Whip and milk coffee: cost ${coffeeWithMilkAndWhip.getCost()}, " +
            "description ${coffeeWithMilkAndWhip.getDescription()}")
    val coffeeWithMilkAndWhipAndVanilla = VanillaCoffee(coffeeWithMilkAndWhip)
    println("Whip and milk and vanilla coffee: cost ${coffeeWithMilkAndWhipAndVanilla.getCost()}, " +
            "description ${coffeeWithMilkAndWhipAndVanilla.getDescription()}")
}