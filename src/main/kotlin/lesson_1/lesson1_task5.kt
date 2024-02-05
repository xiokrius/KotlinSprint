fun main() {

    val secondsInSpace = 6480
    val OneMinSec = 60
    val OneHourMin = 60
    val OneHourSec = OneMinSec*OneHourMin
    val hours: Int = secondsInSpace / OneHourSec
    val remainingSecondsAfterHours: Int = secondsInSpace % OneHourSec
    val minutes: Int = remainingSecondsAfterHours / OneHourMin
    val seconds: Int = remainingSecondsAfterHours % OneMinSec
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

        println(formattedTime)

}
