package LV03

import java.util.*

class ResUserSpanding :AbstractHotel() {
    var userSpanding:Int = 0
    override fun printScreen() {
        println("조회하실 사용자 이름을 입력하세요")
    }

    override fun checkValue() {
        val scanner = Scanner(System.`in`)
        var input = scanner.nextInt()
        try {
            if (input <= 99 || input >= 999) {
                println("올바르지 않은 방번호 입니다. 방번호는 100~999 영역 이내입니다.")
                run()
            } else if(HotelData.userData.checkReservationRoomNum(input.toString())){
                println("이미 체크인 되어있는 호실입니다.")
                run()
            }
            roomNumber = input.toString()
        } catch (e: Exception) {
            println("잘못된 입력입니다. 다시 입력해주세요. error: $e")
            run()
        }
    }

}