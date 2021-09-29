import javax.print.attribute.IntegerSyntax
import kotlin.random.Random

fun main(args: Array<String>) {

    val random = Random(1)
    val list = mutableListOf<Int>();



while (list.size < 6){
    val randomNumber = random.nextInt(45) + 1
    if(list.contains(randomNumber)){
        continue
    }

    list.add(randomNumber)

}

    println(list)

}

