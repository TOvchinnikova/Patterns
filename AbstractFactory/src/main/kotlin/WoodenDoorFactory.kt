class WoodenDoorFactory : DoorFactory {
    override fun makeDoor(): Door {
        return WoodenDoor()
    }

    override fun makeFittingExpert(): DoorFittingExpert {
        return Carpenter()
    }
}