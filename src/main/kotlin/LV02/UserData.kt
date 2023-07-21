package LV02

import kotlin.random.Random

class UserData {
    var userList:ArrayList<User> = ArrayList()
    var userSpandingList:ArrayList<UserSpanding> = ArrayList()

    fun addUser(user:User) {
        userList.add(user)
        println("정상적으로 저장되었습니다.")
        println("User정보: name: ${user.name}, 방번호: ${user.roomNum}, 체크인: ${user.checkIn}, 체크아웃: ${user.checkOut}")
    }

    fun addUserSpanding(name:String) {
        var rand = Random(100000).nextInt()
        var rand2 = Random(10000).nextInt()
        userSpandingList.add(UserSpanding(name, rand.toString(), rand2.toString()))
        println("정상적으로 저장되었습니다.")
        println("현재 지출현황으로 이름: ${name}1. 초기금액: ${rand} 2. 예약금액: ${rand2}")
    }

    fun updateUser(index:Int, user:User) {
        userList.set(index, user)
    }

    fun removeUser(index:Int) = userList.removeAt(index)

    fun printUserList() {
        for (i:Int in 0 until userList.size) {
            println("${i+1}. 사용자: ${userList[i].name}, 방 번호: ${userList[i].roomNum}호, 체크인: ${userList[i].checkIn}. 체크아웃: ${userList[i].checkOut}")
        }
    }

    fun printSortedList() {
        for(i:Int in 0 until userList.size) {
            if(userList.size - i == 1) break
            if(userList[i].checkIn.toInt() > userList[i+1].checkIn.toInt()) {
                var temp = userList[i]
                userList[i] = userList[i+1]
                userList[i+1] = temp
            }
        }
        printUserList()
    }

    fun checkReservationRoomNum(checkRoomNum: String) : Boolean {
        if(userList.size == 0) return false
        return userList.let { (list) -> list.roomNum == checkRoomNum }
    }
}