package LV02

import java.util.*

class ResCheckOut(var instance:ResCheckIn) : AbstractHotel() {
    lateinit var checkOut: String
    override fun printScreen() {
        println("체크아웃 날짜를 입력해주세요 표기형식. 20230631")
    }

    override fun checkValue() {
        val scanner = Scanner(System.`in`)
        var input = scanner.nextInt()
        try {
            if (input <= instance.checkIn.toInt()) {
                println("체크인 날짜보다 이전이거나 같을 수 없습니다.")
                run()
            }
            checkOut = input.toString()
        } catch (e: Exception) {
            println("잘못된 입력입니다. 다시 입력해주세요.")
            run()
        }
    }
}