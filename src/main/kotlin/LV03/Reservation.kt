package LV03

import LV03.HotelData.Companion.resCheckIn
import LV03.HotelData.Companion.resCheckOut
import LV03.HotelData.Companion.resMenuSelector
import LV03.HotelData.Companion.resName
import LV03.HotelData.Companion.resRoomName
import LV03.HotelData.Companion.userData
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
                userData.addUser(User(resName.name, resRoomName.roomNumber, resCheckIn.checkIn, resCheckOut.checkOut))
                println("호텔 예약이 완료되었습니다.")
                run()
            }

            2 -> {
                userData.printUserList()
                run()
            }

            3 -> {
                userData.printSortedList()
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