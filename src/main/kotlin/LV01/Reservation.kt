package LV01

import LV01.HotelData.Companion.resCheckIn
import LV01.HotelData.Companion.resCheckOut
import LV01.HotelData.Companion.resMenuSelector
import LV01.HotelData.Companion.resName
import LV01.HotelData.Companion.resRoomName
import LV01.HotelData.Companion.titleList
import java.util.*

class Reservation {
    fun run() {
        resMenuSelector.run()
        startMenu(resMenuSelector.select)
    }

    fun startMenu(select: Int) {
        when (select) {
            1 -> {
                resName.run()
                resRoomName.run()
                resCheckIn.run()
                resCheckOut.run()
                println("호텔 예약이 완료되었습니다.")
            }

            2 -> {
                println("공사중입니다.")
                run()
            }

            3 -> {
                println("공사중입니다.")
                run()
            }

            4 -> {
                println("시스템을 종료합니다.")
            }

            5 -> {
                println("공사중입니다.")
                run()
            }
            6-> {
                println("공사중입니다.")
                run()
            }

            else -> {}
        }
    }
}