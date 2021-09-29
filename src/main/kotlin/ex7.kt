import javax.print.attribute.IntegerSyntax
import kotlin.random.Random

fun main(args: Array<String>) {

    val random = Random(1)
    val numberSet = mutableSetOf<Int>();

    while (numberSet.size < 6){
        val randomNumber = random.nextInt(45) + 1
        numberSet.add(randomNumber)

    }

    println(numberSet)

}

