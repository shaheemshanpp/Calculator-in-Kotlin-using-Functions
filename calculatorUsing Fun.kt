package funCalc

fun add(num1 : Int , num2 : Int ){
    val sum = num1 + num2
    println("Sum => $num1 + $num2 = $sum")
}

fun subs(num1 : Int , num2 : Int ){
    val sum = num1 - num2
    println("Sum => $num1 - $num2 = $sum")
}

fun into(num1 : Int , num2 : Int ){
    val sum = num1 * num2
    println("Sum => $num1 * $num2 = $sum")
}

fun divi(num1 : Int , num2 : Int ){
    val sum = num1 / num2
    println("Sum => $num1 / $num2 = $sum")
}

fun main(args: Array<String>) {
    var repeat = 1
    while (repeat == 1) {
        println("Enter two numbers : ")
        var a = readLine()!!.toInt()
        var b = readLine()!!.toInt()
        println("Enter an operator : " +
                "\n\ta. Add(+)" +
                "\n\tb. Substract(-)" +
                "\n\tc. Multiplication(*)" +
                "\n\td. Division(/)")
        var op = readLine()
        when{
            op == "+" || op == "A" || op == "a" -> add(a,b)
            op == "-" || op == "B" || op == "b" -> subs(a,b)
            op == "*" || op == "C" || op == "c" -> into(a,b)
            op == "/" || op == "D" || op == "d" -> divi(a,b)
        }
        println(
            "Do you have anything else to calculate?" +
                    "\nEnter 1 for \'Yes\'" +
                    "\nEnter 0 for \'No\'"
        )
        repeat = readLine()!!.toInt()
        if(repeat!==1){
            println("Terminating the program... Thanks for using" +
                    "\n\t\t\t With Love Shan")
            repeat=0
        }
    }
}