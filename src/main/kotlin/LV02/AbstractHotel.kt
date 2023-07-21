package LV02

abstract class AbstractHotel {
    fun run() {
        printScreen()
        checkValue()
    }

    abstract fun printScreen()

    abstract fun checkValue()
}