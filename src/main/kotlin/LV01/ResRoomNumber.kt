package LV01

import java.util.*

class ResRoomNumber : AbstractHotel01() {
    lateinit var roomNumber:String
    override fun printScreen() {
        println("예약할 방번호를 입력해주세요")
    }

    override fun checkValue() {
        val scanner = Scanner(System.`in`)
        var input = scanner.nextInt()
        try {
            if (input <= 99 || input >= 999) {
                println("올바르지 않은 방번호 입니다. 방번호는 100~999 영역 이내입니다.")
                run()
            }

            roomNumber = input.toString()
        } catch (e: Exception) {
            println("잘못된 입력입니다. 다시 입력해주세요.")
            run()
        }
    }
}