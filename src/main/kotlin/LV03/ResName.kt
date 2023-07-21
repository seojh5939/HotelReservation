package LV03

import java.util.*

class ResName : AbstractHotel() {
    lateinit var name: String
    override fun printScreen() {
        println("예약자분의 성함을 입력해주세요")

    }

    override fun checkValue() {
        val scanner = Scanner(System.`in`)
        var input = scanner.next()

        try {
            if (input == null) {
                run()
                println("inputValue: $input")
            }

            if (input.isEmpty()) {
                println("이름은 공백일 수 없습니다.")
                run()
            }
            name = input
        } catch (e: Exception) {
            println("잘못된 입력입니다. 다시 입력해주세요.")
            run()
        }
    }
}