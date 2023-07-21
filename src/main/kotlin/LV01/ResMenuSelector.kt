package LV01

import java.util.*

class ResMenuSelector:AbstractHotel01() {
    var select: Int = 0
    override fun printScreen() {
        HotelData.titleList.let {
            print("${it.get(0)}\n${it.get(1)}\n${it.get(2)}\n")
        }
    }

    override fun checkValue() {
        try {
            val scanner = Scanner(System.`in`)
            var input = scanner.nextInt()
            if (input < 1 || input > 6) {
                println("1번부터 6번까지만 선택가능합니다.")
                run()
            }
            select = input
        } catch (e: Exception) {
            println("잘못된 입력입니다. 다시 입력해주세요.")
            run()
        }
    }
}