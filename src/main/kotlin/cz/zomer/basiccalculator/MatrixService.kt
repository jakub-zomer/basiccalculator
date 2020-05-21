package cz.zomer.basiccalculator

class MatrixService {
    fun matrixAddition(x11: Int, x12: Int, x13: Int, x21: Int, x22: Int, x23: Int,
                       y11: Int, y12: Int, y13: Int, y21: Int, y22: Int, y23: Int) {
        val rows = 2
        val columns = 3
        val firstMatrix = arrayOf(intArrayOf(x11, x12, x13), intArrayOf(x21, x22, x23))
        val secondMatrix = arrayOf(intArrayOf(y11, y12, y13), intArrayOf(y21, y22, y23))
        val matrix = Array(rows) { IntArray(columns) }
        val sum = Array(rows) { IntArray(columns) }
        for (i in 0..rows - 1)
            for (j in 0..columns - 1)
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        println("The sum of two matrices is")
        for (row in sum) {
            for (column in row)
                print("$column     ")

            println()
        }

    }

    fun matrixMultiplication(x11: Int, x12: Int, x13: Int, x21: Int, x22: Int, x23: Int,
                             y11: Int, y12: Int, y13: Int, y21: Int, y22: Int, y23: Int) {
        val rows = 2
        val columns = 3
        val firstMatrix = arrayOf(intArrayOf(x11, x12, x13), intArrayOf(x21, x22, x23))
        val secondMatrix = arrayOf(intArrayOf(y11, y12, y13), intArrayOf(y21, y22, y23))
        val matrix = Array(rows) { IntArray(columns) }
        val product = Array(rows) { IntArray(columns) }
        for (j in 0..columns - 1)
            for (i in 0..rows - 1)
                product[i][j] = firstMatrix[i][j] * secondMatrix[i][j]
        println("The product of two matrices is")
        for (row in product) {
            for (column in row)
                print("$column    ")
            println()
        }
    }

    fun matrixSubtraction(x11: Int, x12: Int, x13: Int, x21: Int, x22: Int, x23: Int,
    y11: Int, y12: Int, y13: Int, y21: Int, y22: Int, y23: Int) {
        val rows = 2
        val columns = 3
        val firstMatrix = arrayOf(intArrayOf(x11, x12, x13), intArrayOf(x21, x22, x23))
        val secondMatrix = arrayOf(intArrayOf(y11, y12, y13), intArrayOf(y21, y22, y23))
        val matrix = Array(rows) { IntArray(columns) }
        val difference = Array(rows) { IntArray(columns) }
        for (j in 0..columns -1)
            for (i in 0..rows -1)
                difference[i][j] = firstMatrix[i][j] - secondMatrix[i][j]
        println("the difference of two matrices is")
        for (row in difference){
            for (column in row)
                print ("$column   ")
            println()
        }
    }
}