import javax.swing.text.StyledEditorKit.BoldAction

fun main (args: Array<String>){
    val currentFish = listOf<Int>()
    val result = canAddFish(10, currentFish, true, 7)
    println(result)
}

fun canAddFish(
                tankSize: Int,
                currentFish: List<Int>,
                hasDecorations: Boolean = true,
                fishSize: Int = 2
                ): Boolean

{
    var counter = 0
    for (c in currentFish){
        if (hasDecorations) counter += c + 2
        else counter += c
    }
    when{
        ((counter + fishSize) > tankSize) -> return false
        tankSize <= counter -> return false
        else -> return true
    }
}
