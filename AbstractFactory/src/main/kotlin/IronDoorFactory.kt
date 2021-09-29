class IronDoorFactory : DoorFactory {
    override fun makeDoor(): Door {
        return IronDoor()
    }

    override fun makeFittingExpert(): DoorFittingExpert {
        return Welder()
    }
}