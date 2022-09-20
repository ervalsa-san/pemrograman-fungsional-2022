package tugas1

fun main() {
    val numbers = listOf(1, 2, 3, 4)
    println(sumSquares(numbers))
}

fun squared(num: Int): Int {
    return num * num
}

fun sumSquares(numbers: List<Int>): Int {
    return numbers.reduce { x, y -> x + squared(y) }
}