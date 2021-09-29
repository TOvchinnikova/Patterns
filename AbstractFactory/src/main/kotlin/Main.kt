fun main() {
    val woodenFactory = WoodenDoorFactory()
    val door = woodenFactory.makeDoor()
    val expert = woodenFactory.makeFittingExpert()
    println("${door.getDescription()}")
    println("${expert.getDescription()}")
}