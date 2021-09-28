fun main() {
    val bulb = Bulb()
    val turnOn = TurnOn(bulb)
    val turnOff = TurnOff(bulb)
    val remoteControl = RemoteControl()
    remoteControl.submit(turnOn)
    remoteControl.submit(turnOff)
}