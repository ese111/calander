fun main(args: Array<String>) {
    val test = MyCalendar()
    val dateString = readLine()

    println(test.stringToDate(dateString))
}