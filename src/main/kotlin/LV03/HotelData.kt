package LV03

class HotelData {
    companion object {
        var title1: String= "호텔예약 프로그램 입니다."
        var title2: String= "[메뉴]"
        var title3: String= "1. 방예약, 2. 예약목록 출력, 3. 예약목록(정렬) 출력, 4. 시스템 종료, 5. 금액 입금-출금 내역 목록 출력, 6. 예약 변경/취소"
        var titleList: ArrayList<String> = arrayListOf<String>(title1, title2, title3)

        var resMenuSelector = ResMenuSelector()
        var resName:ResName= ResName()
        var resRoomName:ResRoomNumber= ResRoomNumber()
        var resCheckIn:ResCheckIn= ResCheckIn()
        var resCheckOut:ResCheckOut= ResCheckOut(resCheckIn)
        var userData:UserData = UserData()
    }
}