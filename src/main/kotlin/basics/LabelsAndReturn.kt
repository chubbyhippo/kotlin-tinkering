package basics

fun main() {
    for (i in 1..5) {
        println("i = $i")
        if (i == 3) break
    }

    label()

    for (i in 1..5) {
        println("i in return= $i")
        if (i == 3) return
    }
    println("End of the Program!")
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label = $i")
//        if (i == 3) break@loop
        innerLoop@ for (j in 1..5) {
            println("j = $j")
//            if (j == 2) break@innerLoop
            if (j == 2) continue@loop
        }
    }
}
