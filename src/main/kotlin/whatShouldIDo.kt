fun main(args: Array<String>) {

}

fun whatShouldIDo(
    mood: String,
    weather: String = "sunny",
    temperature: Int
): String {
    return when{
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        else -> "Stay home and read"
    }
}