fun main(args: Array<String>) {

    var x = 1;

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    when(x){
        0, 1 -> println("x == 0 or x == 1")
        else -> println("atherwise")
    }

    when(x) {
        in 1..10 -> println("x == 1 ~ 10")
        !in 10..20 -> println("x != 10 ~ 20")
        else -> println("atherwise")
    }

    when(x) {
        is Int -> println("x == Int")
        else -> println("x != Int")
    }

}

