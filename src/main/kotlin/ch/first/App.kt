fun main(args: Array<String>) {
    var a = 1
    println("start loop, a is $a")
    while (a < 10) {
        println(a)
        a++
    }
    println("end loop, a is $a")

    val x = 5
    val y = 7
    println("if statement")
    if(x > y) {
        println("x > y")
    } else {
        println("x < y")
    }
    println("if statement ends")

    println("if statement returns value")
    var b = 0
    b = if (x > y) {
        5
    } else {
        10
    }
    println(b)

}