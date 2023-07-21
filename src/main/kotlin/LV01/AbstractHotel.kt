package LV01

abstract class AbstractHotel01 {
    fun run() {
        printScreen()
        checkValue()
    }

    abstract fun printScreen()

    abstract fun checkValue()
}