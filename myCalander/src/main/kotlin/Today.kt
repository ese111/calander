import java.util.*

class MyCalendar {

    fun today(calendar: Calendar): Calendar {
        val year = calendar.get(Calendar.YEAR)
        val mon = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val min = calendar.get(Calendar.MINUTE)
        val sec = calendar.get(Calendar.SECOND)

        return calendar.set(year,mon,day,hour,min,sec)
    }

    fun stringToDate(string:String): Calendar {
        val year = string.substring(0,3)
        val month = string.substring(4,5)
        val day = string.substring(6,7)
        val calendar: Calendar
        calendar.set(year,month,day)

        return calendar
    }

}