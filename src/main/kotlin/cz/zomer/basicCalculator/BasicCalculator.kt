package cz.zomer.basicCalculator
fun main() {
    println("set value a")
    val a = readLine()!!.toDouble()
    println("set value b")
    val b = readLine()!!.toDouble()

    val service = CalculationService()
    val su = service.addition(a, b)
    println("Addition = $su")
    val sub = service.substraction(a, b)
    println("Substraction = $sub")
    val multi = service.multipliction(a, b)
    println("Mulitplication = $multi")
    val div = service.division(a, b)
    println("Division = $div")

}
