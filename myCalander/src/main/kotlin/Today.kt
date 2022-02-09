import java.util.*

class Today {

    fun today(calendar: Calendar){
        val year = calendar.get(Calendar.YEAR)
        val mon = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val min = calendar.get(Calendar.MINUTE)
        val sec = calendar.get(Calendar.SECOND)

        calendar.set(year,mon,day,hour,min,sec)

    }

}