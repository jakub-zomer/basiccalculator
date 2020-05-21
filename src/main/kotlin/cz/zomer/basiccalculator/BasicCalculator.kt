package cz.zomer.basicCalculator

import cz.zomer.basiccalculator.CalculationService
import cz.zomer.basiccalculator.MatrixService



    fun main(args: Array<String>) {
        println("set value a")
        val a = readLine()!!.toDouble()
        println("set value b")
        val b = readLine()!!.toDouble()

        val service = CalculationService()
        val su = service.addition(a, b)
        println("Addition = $su")
        val sub = service.subtraction(a, b)
        println("Substraction = $sub")
        val multi = service.multipliction(a, b)
        println("Mulitplication = $multi")
        val div = service.division(a, b)
        println("Division = $div")


        val matrix = MatrixService()
        println("Set value x11")
        val x11 = readLine()!!.toInt()
        println("Set value x12")
        val x12 = readLine()!!.toInt()
        println("Set value x13")
        val x13 = readLine()!!.toInt()
        println("Set value x21")
        val x21 = readLine()!!.toInt()
        println("Set value x22")
        val x22 = readLine()!!.toInt()
        println("Set value x23")
        val x23 = readLine()!!.toInt()
        println("Set value y11")
        val y11 = readLine()!!.toInt()
        println("Set value y12")
        val y12 = readLine()!!.toInt()
        println("Set value y13")
        val y13 = readLine()!!.toInt()
        println("Set value y21")
        val y21 = readLine()!!.toInt()
        println("Set value y22")
        val y22 = readLine()!!.toInt()
        println("Set value y23")
        val y23 = readLine()!!.toInt()

        val matrixSum = matrix.matrixAddition(x11, x12, x13, x21, x22, x23, y11, y12, y13, y21, y22, y23)
        println("$matrixSum")
        println("" +
                "")

        val matrixProduct = matrix.matrixMultiplication(x11, x12, x13, x21, x22, x23, y11, y12, y13, y21, y22, y23)
        println("$matrixProduct")
        println("" +
                "")

        val matrixDifference = matrix.matrixSubtraction(x11, x12, x13, x21, x22, x23, y11, y12, y13, y21, y22, y23)
        println("$matrixDifference")

        }

