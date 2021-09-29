import javax.print.attribute.IntegerSyntax
import kotlin.random.Random

fun main(args: Array<String>) {

    val random = Random(100)
    print(random.nextInt(45) + 1)

}

