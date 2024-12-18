package `241218`

internal object BicycleDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        // Create two different
        // Bicycle objects

        val bike1: Bicycle = Bicycle()
        val bike2: Bicycle = Bicycle()

        // Invoke methods on
        // those objects
        bike1.changeCadence(50)
        bike1.speedUp(10)
        bike1.changeGear(2)
        bike1.printStates()

        bike2.changeCadence(50)
        bike2.speedUp(10)
        bike2.changeGear(2)
        bike2.changeCadence(40)
        bike2.speedUp(10)
        bike2.changeGear(3)
        bike2.printStates()
    }
}
