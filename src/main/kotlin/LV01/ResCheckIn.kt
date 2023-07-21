package LV01

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class ResCheckIn : AbstractHotel01() {
    var checkIn:String =""
    override fun printScreen() {
        println("체크인 날짜를 입력해주세요 표기형식. 20230631")
    }

    override fun checkValue() {
        val scanner = Scanner(System.`in`)
        var input = scanner.nextInt()
        try {
            var today = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("yyyyMMdd")
            val diff = today.format(formatter)!!.toInt()

            if (input < diff) {
                println("체크인은 지난날은 선택할 수 없습니다.")
                run()
            } else {
                checkIn = input.toString()
            }
        } catch (e: Exception) {
            println("잘못된 입력입니다. 다시 입력해주세요.")
            run()
        }
    }
}