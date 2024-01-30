fun main() {

    val secondsInSpace = 6360

    val hours: Int = secondsInSpace / 3600

    val remainingSecondsAfterHours: Int = secondsInSpace % 3600

    val minutes: Int = remainingSecondsAfterHours / 60

    val seconds: Int = remainingSecondsAfterHours % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

        println(formattedTime)

}
